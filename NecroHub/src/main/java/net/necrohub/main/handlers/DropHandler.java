package net.necrohub.main.handlers;

import net.necrohub.main.NecroHub;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class DropHandler implements Listener {
	@SuppressWarnings("unused")
	private static NecroHub plugin;

	public DropHandler(NecroHub hub) {
		DropHandler.plugin = hub;
	}

	@EventHandler
	public void onDropItemEvent(final PlayerDropItemEvent e) {
			e.setCancelled(true);
	}

}
