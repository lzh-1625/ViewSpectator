package top.xcon.where.commands;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import top.xcon.where.Picture;
import top.xcon.where.Utils;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Command implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, org.bukkit.command.@NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player)){
            System.out.println("该指令只能玩家使用！");
            return false;
        }
        byte[] file= new byte[0];
        try {
            file = new Picture().takePictureFile((Player) sender);
        } catch (ExecutionException | InterruptedException | IOException e) {
            e.printStackTrace();
        }
        try {
            String b64= Utils.getImageString(file);
            String message = "[CQ:image,file=" + "base64://" + b64+ "]";
            HttpResponse<String> response = Unirest.post("http://xcon.top:5700/send_group_msg")
                    .header("Content-Type", "application/json")
                    .body("{\r\n    \"group_id\": 1082601881,\r\n    \"message\": \""+message+"\"\r\n}")
                    .asString();


        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
