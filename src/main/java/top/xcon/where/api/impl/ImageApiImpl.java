package top.xcon.where.api.impl;


import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import top.xcon.where.Picture;
import top.xcon.where.ViewSpectator;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class ImageApiImpl implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        List<String> tokenList = exchange.getRequestHeaders().get("token");
        if (!(!tokenList.isEmpty() && tokenList.get(0).equals(ViewSpectator.token))) {
            exchange.sendResponseHeaders(400, 0);
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
        byte[] file = new byte[0];
        try {
            Player player = Bukkit.getPlayer(params.get("player"));
            if (player == null) {
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
