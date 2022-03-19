package com.github.awesomegero.tiger;

import com.github.awesomegero.tiger.listener.DropListener;
import com.github.awesomegero.tiger.listener.InteractListener;
import com.github.awesomegero.tiger.listener.InventoryClickListener;
import org.bukkit.plugin.java.JavaPlugin;

public class TigerLibrary {
    private static JavaPlugin PLUGIN;

    public static JavaPlugin getPlugin() {
        return PLUGIN;
    }

    public static void setPlugin(final JavaPlugin plugin) {
        TigerLibrary.PLUGIN = plugin;
    }

    public static void setup() {
        PLUGIN.getServer().getPluginManager().registerEvents(new InventoryClickListener(), PLUGIN);
        PLUGIN.getServer().getPluginManager().registerEvents(new InteractListener(), PLUGIN);
        PLUGIN.getServer().getPluginManager().registerEvents(new DropListener(), PLUGIN);
    }
}
