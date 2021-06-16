package de.hyrulehamster.serverutils.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.DARK_GRAY+"["+ChatColor.GREEN+"+"+ChatColor.DARK_GRAY+"] "+player.getName());
    }

}
