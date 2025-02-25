package top.xcon.where;

import org.bukkit.Bukkit;
import org.bukkit.FluidCollisionMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public class Picture {
    private static HashMap<Player, Long> delayMap = new HashMap<>();
    private Player player;
    private ViewSpectator instance = ViewSpectator.getInstance();

    public byte[] takePictureFile(Player p) throws IOException, ExecutionException, InterruptedException {
        player = p;
        BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
        int[][] result = scheduler.callSyncMethod(instance, this::performTask).get();
        BufferedImage image = new BufferedImage(912, 512, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < 228; x++) {
            for (int y = 0; y < 128; y++) {
                for (int xi = 0; xi < 4; xi++) {
                    for (int yi = 0; yi < 4; yi++) {
                        image.setRGB(x * 4 + xi, y * 4 + yi, result[x][y]);
                    }
                }
            }
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "jpg", outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outputStream.toByteArray();
    }

    private int[][] performTask() {
        // 在主线程中执行具体任务并返回数据
        ViewSpectator instance = ViewSpectator.getInstance();
        Location eyes = player.getEyeLocation();
        int[][] data = new int[228][128];
        double pitch = -Math.toRadians(player.getEyeLocation().getPitch());
        double yaw = Math.toRadians(player.getEyeLocation().getYaw() + 90);
        boolean transparentWater = true;
        boolean shadows = true;
        for (int x = 0; x < 228; x++) {
            for (int y = 0; y < 128; y++) {

                // calculate ray rotations
                double yrotate = -((y) * 0.9 / 128 - .45);
                double xrotate = ((x) * 1.6 / 228 - .45);
                Vector rayTraceVector = new Vector(Math.cos(yaw + xrotate) * Math.cos(pitch + yrotate),
                        Math.sin(pitch + yrotate), Math.sin(yaw + xrotate) * Math.cos(pitch + yrotate));

                RayTraceResult blockResult = player.getWorld().rayTraceBlocks(eyes, rayTraceVector, 256);

                Location eyeLocation = player.getEyeLocation();
                RayTraceResult entityResult = player.getWorld().rayTraceEntities(eyeLocation.add(rayTraceVector), rayTraceVector, 256);
                if (entityResult != null && entityResult.getHitEntity() != null && !(blockResult != null && blockResult.getHitBlock() != null && eyes.distance(entityResult.getHitEntity().getLocation()) > eyes.distance(blockResult.getHitBlock().getLocation()))) {

                    if (entityResult.getHitEntity() instanceof Player) {
                        if (y % 2 == 0) {
                            data[x][y] = new Color(204, 102, 0).getRGB();
                        } else {
                            data[x][y] = new Color(255, 255, 255).getRGB();
                        }
                    } else {
                        if (y % 2 == 0) {
                            data[x][y] = new Color(238, 99, 99).getRGB();
                        } else {
                            data[x][y] = new Color(255, 255, 255).getRGB();
                        }
                    }
                    continue;
                }


                // Color change for liquids
                RayTraceResult liquidResult = player.getWorld().rayTraceBlocks(eyes, rayTraceVector, 256,
                        FluidCollisionMode.ALWAYS, false);
                double[] dye = new double[]{1, 1, 1}; // values color is multiplied by
                if (transparentWater) {
                    if (liquidResult != null) {
                        if (liquidResult.getHitBlock().getType().equals(Material.WATER))
                            dye = new double[]{.5, .5, 1};
                        if (liquidResult.getHitBlock().getType().equals(Material.LAVA))
                            dye = new double[]{1, .3, .3};
                    }
                }

                if (blockResult != null) {
                    byte lightLevel = blockResult.getHitBlock().getRelative(blockResult.getHitBlockFace()).getLightLevel();
                    if (lightLevel > 0 && shadows) {
                        double shadowLevel = 15.0;
                        for (int i = 0; i < dye.length; i++) {
                            dye[i] = dye[i] * (lightLevel / shadowLevel);
                        }
                    }
                    if (transparentWater) {
                        int rgb = Utils.getColorFromType(blockResult.getHitBlock(), dye).getRGB();
                        data[x][y] = rgb;

                    } else {
                        int rgb = Utils.getColorFromType(liquidResult.getHitBlock(), dye).getRGB();
                        data[x][y] = rgb;
                    }
                } else if (liquidResult != null) {
                    int rgb = Utils.getColorFromType(liquidResult.getHitBlock(), new double[]{1, 1, 1}).getRGB();
                    data[x][y] = rgb;

                    // set map pixel to color of liquid block found
                } else {
                    int rgb = new Color(51, 153, 255).getRGB();
                    data[x][y] = rgb;

                    // no block was hit, so we will assume we are looking at the sky
                }

            }
        }
        return data;
    }


}
