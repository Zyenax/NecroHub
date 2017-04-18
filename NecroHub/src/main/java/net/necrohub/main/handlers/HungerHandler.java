package net.necrohub.main.handlers;

import net.necrohub.main.NecroHub;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class HungerHandler implements Listener{
	
	@SuppressWarnings("unused")
	private NecroHub plugin;
	public HungerHandler(NecroHub listener) {
		this.plugin = listener;		
	}
	
	@EventHandler
	public void noHunger(FoodLevelChangeEvent e){
		e.setCancelled(true);
	}

}
