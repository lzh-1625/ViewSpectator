package top.xcon.where.api;

import com.sun.net.httpserver.HttpServer;
import top.xcon.where.api.impl.ImageApiImpl;
import top.xcon.where.api.impl.PlayerApiImpl;
import top.xcon.where.api.impl.StaticApiImpl;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class Api {

    public static HttpServer webserve() throws IOException {

        InetSocketAddress addr = new InetSocketAddress(8250);
        HttpServer server = HttpServer.create(addr, 0);
        server.createContext("/picture", new ImageApiImpl());
        server.createContext("/player/list", new PlayerApiImpl());
        server.createContext("/", new StaticApiImpl());
        server.setExecutor(Executors.newCachedThreadPool());
        server.start();
        return server;
    }
}
