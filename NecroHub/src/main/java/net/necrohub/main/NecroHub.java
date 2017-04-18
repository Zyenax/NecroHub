package net.necrohub.main;

import java.util.List;

import net.minecraft.server.v1_8_R3.EnumParticle;
import net.necrocore.main.NecroCore;
import net.necrocore.main.utils.Packets;
import net.necrocore.main.utils.Utils;
import net.necrohub.main.handlers.BlockSpread;
import net.necrohub.main.handlers.BuildHandler;
import net.necrohub.main.handlers.CommandHandler;
import net.necrohub.main.handlers.DamageHandler;
import net.necrohub.main.handlers.DropHandler;
import net.necrohub.main.handlers.HungerHandler;
import net.necrohub.main.handlers.InventoryHandler;
import net.necrohub.main.handlers.ItemHandler;
import net.necrohub.main.handlers.PadHandler;
import net.necrohub.main.handlers.PickupHandler;
import net.necrohub.main.handlers.ScoreBoardHandler;
import net.necrohub.main.handlers.StackHandler;
import net.necrohub.main.handlers.VisibilityHandler;
import net.necrohub.main.handlers.WeatherHandler;
import net.necrohub.main.menus.GameMenu;
import net.necrohub.main.menus.ProfileMenu;
import net.necrohub.main.menus.SettingsMenu;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class NecroHub extends JavaPlugin implements Listener{
	
	public static String GetServer;
	public static String[] serverList;
	
	public void onEnable(){
		Bukkit.createWorld(new WorldCreator ("world").type(WorldType.FLAT));
		registerListeners();
		registerCommands();
		NecroCore.useCoreChat = true;
		NecroCore.useCoreTabAndTag = true;
		Packets.createParticleHelix(new Location(Bukkit.getWorld("world"), 958.5, 91, 167.5), 21, 5, 1.0, EnumParticle.FIREWORKS_SPARK);
		Packets.createParticleCircle(new Location(Bukkit.getWorld("world"), 957.5, 91, 46.5), 7, 2, 0.1, EnumParticle.FLAME);
	    ConsoleCommandSender console = Bukkit.getConsoleSender();
		console.sendMessage(Utils.color(NecroCore.name + " &aHub plugin has been enabled!"));
		List<Entity> entities = Bukkit.getWorld("world").getEntities();
		for ( Entity entity : entities){
			if(!(entity instanceof Player)){
				entity.remove();
			}
		}
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable(){
    		public void run() {
    			if(Bukkit.getPluginManager().getPlugin("NecroCore") == null){
    				Bukkit.getServer().broadcastMessage(Utils.color(NecroCore.name + " &4&lFATAL: &cNecroCore plugin not found some features WILL NOT work on the server please add NecroCore to the servers plugin folder or notify an [Admin]"));
    			}
    		}
    	}, 20);
	}
	
	public void onDisable(){
		ConsoleCommandSender console = Bukkit.getConsoleSender();
		console.sendMessage(Utils.color(NecroCore.name + " &cHub plugin has been disabled!"));
		List<Entity> entities = Bukkit.getWorld("world").getEntities();
		for ( Entity entity : entities){
			if(!(entity instanceof Player)){
				entity.remove();
			}
		}
	}
	
	public void registerListeners(){
		PluginManager manager = Bukkit.getServer().getPluginManager();
		manager.registerEvents(new PlayerJoin(this), this);
		manager.registerEvents(new PlayerQuit(this), this);
		manager.registerEvents(new BuildHandler(this), this);
		manager.registerEvents(new DropHandler(this), this);
		manager.registerEvents(new HungerHandler(this), this);
		manager.registerEvents(new PickupHandler(this), this);
		manager.registerEvents(new ScoreBoardHandler(this), this);
		manager.registerEvents(new WeatherHandler(this), this);
		manager.registerEvents(new DamageHandler(this), this);
		manager.registerEvents(new BlockSpread(this), this);
		manager.registerEvents(new ItemHandler(this), this);
		manager.registerEvents(new GameMenu(this), this);
		manager.registerEvents(new InventoryHandler(this), this);
		manager.registerEvents(new PadHandler(this), this);
		manager.registerEvents(new CommandHandler(this), this);
		manager.registerEvents(new ProfileMenu(this), this);
		manager.registerEvents(new SettingsMenu(this), this);
		manager.registerEvents(new VisibilityHandler(this), this);
		manager.registerEvents(new StackHandler(this), this);
	}
	
	public void registerCommands(){
		getCommand("spawn").setExecutor(new CommandHandler(this));
	}

}
