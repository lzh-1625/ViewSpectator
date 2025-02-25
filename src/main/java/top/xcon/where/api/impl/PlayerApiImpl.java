package top.xcon.where.api.impl;

import com.alibaba.fastjson2.JSONObject;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.bukkit.Bukkit;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import top.xcon.where.ViewSpectator;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerApiImpl implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String requestMethod = exchange.getRequestMethod();
        List<String> tokenList = exchange.getRequestHeaders().get("token");

        // 验证token
        if (!(!tokenList.isEmpty() && tokenList.get(0).equals(ViewSpectator.token))) {
            exchange.sendResponseHeaders(400, 0);
            return;
        }

        // 处理GET请求
        if (requestMethod.equalsIgnoreCase("GET")) {
            OutputStream responseBody = exchange.getResponseBody();
            List<String> nameList = new ArrayList<>(Bukkit.getServer().getOnlinePlayers())
                    .stream()
                    .map(HumanEntity::getName)
                    .collect(Collectors.toList());

            // 将名字列表转换为JSON格式
            String data = JSONObject.toJSONString(nameList);

            // 设置响应头
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, data.getBytes().length);
            responseBody.write(data.getBytes());
            responseBody.close();
        } else {
            // 处理非GET请求的情况
            exchange.sendResponseHeaders(500, 0);
        }
    }
}