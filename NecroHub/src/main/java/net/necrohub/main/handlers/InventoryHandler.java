package net.necrohub.main.handlers;

import net.necrohub.main.NecroHub;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

public class InventoryHandler implements Listener{
	
	@SuppressWarnings("unused")
	private NecroHub plugin;
	public InventoryHandler(NecroHub listener) {
		this.plugin = listener;		
	}
	
	@EventHandler
	public void onClickEvent(InventoryClickEvent e) {
		if (e.getWhoClicked().getGameMode().equals(GameMode.CREATIVE)) {
			if(e.getWhoClicked().getInventory().equals(InventoryType.CREATIVE)){
				e.setCancelled(false);
			}
		} else
			e.setCancelled(true);
	}

}
