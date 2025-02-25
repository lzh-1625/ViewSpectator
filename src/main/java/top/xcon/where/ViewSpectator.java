package top.xcon.where;

import com.sun.net.httpserver.HttpServer;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;
import top.xcon.where.api.Api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ViewSpectator extends JavaPlugin {

    private static ViewSpectator instance;
    static HttpServer server;
    public static String token;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        tokenInit();
        instance = this;
        try {
            server = Api.webserve();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Utils.loadColors();
    }

    @Override
    public void onDisable() {
        /* Disable all current async tasks */
        server.stop(0);
        Bukkit.getScheduler().cancelTasks(this);

    }

    private void tokenInit() {
        token = getConfig().getString("token");
    }

    public static ViewSpectator getInstance() {
        return instance;
    }


}
