package de.hyrulehamster.serverutils;

import de.hyrulehamster.serverutils.Listeners.JoinListener;
import de.hyrulehamster.serverutils.Listeners.QuitListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("ServerUtils is now enabled/reloaded.");

        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinListener(),this);
        pluginManager.registerEvents(new QuitListener(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
