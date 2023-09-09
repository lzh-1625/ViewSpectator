package top.xcon.where;

import com.sun.net.httpserver.HttpServer;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import top.xcon.where.commands.Command;

import java.io.IOException;
import java.util.Objects;

public class ViewSpectator extends JavaPlugin {

	private static ViewSpectator instance;
	static HttpServer server;
	static String token;
	@Override
	public void onEnable() {
		saveDefaultConfig();
		tokenInit();
		instance = this;
		try {
			server=	Api.webserve();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Utils.loadColors();
		Objects.requireNonNull(this.getCommand("takepicture")).setExecutor(new Command());

	}

	@Override
	public void onDisable() {
		/* Disable all current async tasks */
		server.stop(0);
		Bukkit.getScheduler().cancelTasks(this);

	}

	private void tokenInit(){
		token=getConfig().getString("token");
	}

	public static ViewSpectator getInstance() {
		return instance;
	}


}
