package net.necrohub.main.handlers;

import net.necrohub.main.NecroHub;

import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class WeatherHandler implements Listener {
	@SuppressWarnings("unused")
	private NecroHub plugin;

	public WeatherHandler(NecroHub hub) {
		this.plugin = hub;
	}

	@EventHandler
	  public void weatherChange(WeatherChangeEvent event)
	  {
	    if (event.toWeatherState()) {
	        World world = event.getWorld();
	          event.setCancelled(true);
	          world.setStorm(false);
	          world.setThundering(false);
	          world.setWeatherDuration(0);
	    }
	  }

}
