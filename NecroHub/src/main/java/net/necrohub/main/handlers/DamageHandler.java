package net.necrohub.main.handlers;

import net.necrohub.main.NecroHub;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class DamageHandler implements Listener {
	@SuppressWarnings("unused")
	private NecroHub plugin;

	public DamageHandler(NecroHub hub) {
		this.plugin = hub;
	}

	@EventHandler
	public void onVoidDamage(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		if (p.getLocation().getY() <= 0.0D) {
			Location loc = new Location(Bukkit.getWorld("world"), 937.5, 102, 101.5, -90, 0);
			p.teleport(loc);
		}
	}
	
	@EventHandler
	  public void onEntityDamage(EntityDamageEvent e){
	   e.setCancelled(true);
	  }

	@EventHandler
	public void noPlayerDamage(EntityDamageByEntityEvent e) {
		e.setCancelled(true);
	}

}
