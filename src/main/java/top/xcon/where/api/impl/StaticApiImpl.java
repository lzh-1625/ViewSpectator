package top.xcon.where.api.impl;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StaticApiImpl implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String path = "";
        if (exchange.getRequestURI().getPath().isEmpty()) {
            path = "/templates/index.html";
        } else {
            path = "/templates" + exchange.getRequestURI().getPath();
        }
        InputStream stream = getClass().getResourceAsStream(path);
        byte[] bytes = toByteArray(stream);
        exchange.sendResponseHeaders(200, 0);
        OutputStream os = exchange.getResponseBody();
        os.write(bytes);
        os.close();


    }

    public static byte[] toByteArray(InputStream input) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int n = 0;
        while (-1 != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
        }
        return output.toByteArray();
    }
}