package de.hyrulehamster.serverutils.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {

    @EventHandler
    public void onJoin(PlayerQuitEvent event){
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.GRAY+"["+ChatColor.RED+" - "+ChatColor.GRAY+"] "+player.getName());
    }

}
