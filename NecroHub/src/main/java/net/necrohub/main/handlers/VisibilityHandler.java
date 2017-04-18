package net.necrohub.main.handlers;

import net.necrocore.main.SQL.SQLVisibility;
import net.necrohub.main.NecroHub;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class VisibilityHandler implements Listener{
	
	@SuppressWarnings("unused")
	private NecroHub plugin;
	public VisibilityHandler(NecroHub necroHub) {
		this.plugin = necroHub;		
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		for(Player p : Bukkit.getOnlinePlayers()){
			if(SQLVisibility.getVisibility(p).equalsIgnoreCase("false")){
				p.hidePlayer(e.getPlayer());
			}
		}
		if(SQLVisibility.getVisibility(e.getPlayer()).equalsIgnoreCase("false")){
			for(Player p : Bukkit.getOnlinePlayers()){
				e.getPlayer().hidePlayer(p);
			}
		}
	}

}
