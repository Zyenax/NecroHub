package net.necrohub.main.handlers;

import net.necrohub.main.NecroHub;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockSpreadEvent;

public class BlockSpread implements Listener{

	@SuppressWarnings("unused")
	private NecroHub plugin;
	public BlockSpread(NecroHub listener) {
		this.plugin = listener;		
	}
	
	@EventHandler
	public void onBlockSpread(BlockSpreadEvent event) {
	event.setCancelled(true);
	}
	
}
