package net.necrohub.main.handlers;

import net.necrohub.main.NecroHub;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class PickupHandler implements Listener {
	@SuppressWarnings("unused")
	private static NecroHub plugin;

	public PickupHandler(NecroHub hub) {
		PickupHandler.plugin = hub;
	}

	@EventHandler
	public void onPlayerPickupItem(PlayerPickupItemEvent e) {
		if(e.getPlayer().getGameMode() != GameMode.CREATIVE){
			e.setCancelled(true);
		}
	}

}
