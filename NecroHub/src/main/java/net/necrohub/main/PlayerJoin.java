package net.necrohub.main;

import java.util.Arrays;

import net.necrocore.main.NecroCore;
import net.necrocore.main.SQL.SQLRanks;
import net.necrocore.main.handlers.Rank;
import net.necrocore.main.utils.Packets;
import net.necrocore.main.utils.Utils;
import net.necrohub.main.handlers.ScoreBoardHandler;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerJoin implements Listener{
	
	private NecroHub plugin;
	public PlayerJoin(NecroHub listener) {
		this.plugin = listener;		
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event){
		final Player player = event.getPlayer();
		player.setCollidable(false);
		event.setJoinMessage(Utils.color("&8[&a+&8] &e" + player.getName()));
		player.getInventory().clear();
		event.getPlayer().setFoodLevel(20);
		giveItems(player);
		Location loc = new Location(Bukkit.getWorld("world"), 937.5, 102, 101.5, -90, 0);
		player.teleport(loc);
		player.setGameMode(GameMode.ADVENTURE);
		ScoreBoardHandler.makeScoreBoard(player);
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
    		public void run() {
    			Packets.sendTabTitle(player, Utils.color(" &7&m-----[--&r " + NecroCore.name + " &7&m--]-----&r"), Utils.color("&cPlay.NecroCube.Net"), Utils.color(" "), Utils.color(" "), Utils.color("&eRank: &a" + SQLRanks.getRank(player)), Utils.color("&r &7&m-----[--&r " + NecroCore.name + " &7&m--]-----"));
    			if(SQLRanks.getRank(player).equals(Rank.DONOR3.getName()) 
    					|| SQLRanks.getRank(player).equals(Rank.DONOR2.getName()) 
    					|| SQLRanks.getRank(player).equals(Rank.DONOR1.getName()) 
    					|| SQLRanks.getRank(player).equals(Rank.HELPER.getName()) 
    					|| SQLRanks.getRank(player).equals(Rank.MOD.getName()) 
    					|| SQLRanks.getRank(player).equals(Rank.SRMOD.getName()) 
    					|| SQLRanks.getRank(player).equals(Rank.ADMIN.getName()) 
    					|| SQLRanks.getRank(player).equals(Rank.OWNER.getName())){
    					player.setAllowFlight(true);
    				}else{
    					player.setAllowFlight(false);
    				}
    			if(Bukkit.getPluginManager().getPlugin("NecroCore") == null){
    				Bukkit.getServer().broadcastMessage(Utils.color(NecroCore.name + " &4&lFATAL: &cNecroCore plugin not found some features WILL NOT work on the server please add NecroCore to the servers plugin folder or notify an [Admin]"));
    			}
    		}
    	}, 3);
	}
	
	public static void giveItems(Player p){
		ItemStack selector = Utils.createItem(Material.COMPASS,1,0,Utils.color("&cRealm Selector &7- &eRight Click"), Arrays.asList(Utils.color("&7Right click to open the Realm Menu!")));
		ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&cProfile Menu &7- &eRight Click"), Arrays.asList(Utils.color("&7Right click to open the Profile Menu!"), Utils.color("&7Also useful for viewing stats!")));
		ItemStack settings = Utils.createItem(Material.NAME_TAG,1,0,Utils.color("&cSettings Menu &7- &eRight Click"), Arrays.asList(Utils.color("&7Right click to open the Settings Menu!"), Utils.color("&7And change all the preferred settings.")));
		
		p.getInventory().setItem(0, selector);
		p.getInventory().setItem(2, profile);
		p.getInventory().setItem(8, settings);
	}

}
