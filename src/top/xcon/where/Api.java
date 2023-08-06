package top.xcon.where;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Api implements HttpHandler {

    public static HttpServer webserve()  throws IOException {

        InetSocketAddress addr = new InetSocketAddress(8250);
        HttpServer server = HttpServer.create(addr, 0);
        server.createContext("/picture", new Api());
        server.createContext("/player/list", new Api());
        server.setExecutor(Executors.newCachedThreadPool());
        server.start();
        return server;
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String requestMethod = exchange.getRequestMethod();
        List<String> tokenList=exchange.getRequestHeaders().get("token");
        if(!(tokenList.size()!=0&&tokenList.get(0).equals(ViewSpectator.token))){
            exchange.sendResponseHeaders(400,0);
            return;
        }
        if (requestMethod.equalsIgnoreCase("GET")){
            if(exchange.getRequestURI().toString().equals("/player/list")){
                if (requestMethod.equalsIgnoreCase("GET")){
                    OutputStream responseBody = exchange.getResponseBody();
                    List<Player> list = new ArrayList<Player>(Bukkit.getServer().getOnlinePlayers());
                    StringBuilder stringBuilder=new StringBuilder();
                    for(Player player:list){
                        stringBuilder.append(player.getName()).append(";");
                    }
                    exchange.sendResponseHeaders(200, stringBuilder.toString().getBytes().length);
                    responseBody.write(stringBuilder.toString().getBytes());
                    responseBody.close();
                }
                return;
            }
            URI uri = exchange.getRequestURI();
            String query = uri.getQuery();
            Map<String, String> params = new HashMap<>();
            if (query != null) {
                String[] keyValuePairs = query.split("&");
                for (String keyValuePair : keyValuePairs) {
                    String[] keyValue = keyValuePair.split("=");
                    if (keyValue.length == 2) {
                        String key = URLDecoder.decode(keyValue[0], "UTF-8");
                        String value = URLDecoder.decode(keyValue[1], "UTF-8");
                        params.put(key, value);
                    }
                }
            }
            exchange.getResponseHeaders().add("Content-Type", "application/octet-stream");
            OutputStream outputStream = exchange.getResponseBody();
            byte[] file= new byte[0];
            try {
                Player player=Bukkit.getPlayer(params.get("player"));
                if(player==null){
                    exchange.sendResponseHeaders(200, file.length);
                    outputStream.write("error".getBytes());
                    outputStream.close();
                    return;
                }
                file = new Picture().takePictureFile(Bukkit.getPlayer(params.get("player")));
            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }
            exchange.sendResponseHeaders(200, file.length);
            outputStream.write(file);
            outputStream.close();
        }
    }
}
