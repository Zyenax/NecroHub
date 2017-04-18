package net.necrohub.main.menus;

import java.util.Arrays;
import java.util.HashMap;

import net.necrocore.main.utils.BungeeUtil;
import net.necrocore.main.utils.Utils;
import net.necrohub.main.NecroHub;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;

public class GameMenu implements Listener{
	
	public static Inventory inv;
	
	private static NecroHub plugin;
	public GameMenu(NecroHub listener) {
		plugin = listener;	
		Inventory inventory = Bukkit.createInventory(null, 45, Utils.color("&8Realms"));
		inv = inventory;
		Border();
		Game1("Game1");
		Game2("Game2");
		Game3("Game3");
	}
	
	public static HashMap<Player, BukkitTask> MenuMap = new HashMap<Player, BukkitTask>();
	public static void Menu(final Player p){
		p.openInventory(inv);
		BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
		if(!(MenuMap.containsKey(p))){
			MenuMap.put(p, scheduler.runTaskTimer(plugin, new Runnable() {
				public void run() {
					if(p.getOpenInventory().getTopInventory().getName().equals(Utils.color("&8Realms"))){
						p.updateInventory();
					}
				}	
			}, 0, 10L));
		}else{
			MenuMap.get(p).cancel();
			MenuMap.remove(p);
			return;
		}
	}
	
	@EventHandler
	public void onInvClose(InventoryCloseEvent event){
		if(MenuMap.containsKey(event.getPlayer())){
			MenuMap.get(event.getPlayer()).cancel();
			MenuMap.remove(event.getPlayer());
		}
	}
	
	public static void Border(){
		ItemStack border = Utils.createItem(Material.STAINED_GLASS_PANE, 1, 15, Utils.color(" "), null);
		inv.setItem(0, border);
		inv.setItem(1, border);
		inv.setItem(2, border);
		inv.setItem(3, border);
		inv.setItem(4, border);
		inv.setItem(5, border);
		inv.setItem(6, border);
		inv.setItem(7, border);
		inv.setItem(8, border);
		inv.setItem(9, border);
		inv.setItem(17, border);
		inv.setItem(18, border);
		inv.setItem(26, border);
		inv.setItem(27, border);
		inv.setItem(35, border);
		inv.setItem(36, border);
		inv.setItem(37, border);
		inv.setItem(38, border);
		inv.setItem(39, border);
		inv.setItem(40, border);
		inv.setItem(41, border);
		inv.setItem(42, border);
		inv.setItem(43, border);
		inv.setItem(44, border);
	}
	
	public void Game1(final String servername){
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable(){
    		public void run() {
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
    		public void run() {
    			for(Player player : Bukkit.getOnlinePlayers()){
    				if(player != null){
    					ItemStack item = Utils.createItem(Material.WOOL, 1, 14, Utils.color("&eBarrage-1"), Arrays.asList(Utils.color(" "), Utils.color("&7Fight against other players"), Utils.color("&7in order to level up and gain"), Utils.color("&7some currency to compete with your friends"), Utils.color("&7and possibly a chance to win epic gear!"), Utils.color(" "), Utils.color("&8Join &a" + BungeeUtil.playerCountOfServer(player, servername) + " &8others"), Utils.color("&0█ &cClick to join this server")));
            			inv.setItem(20, item);
    				}
    			}
    		}
		}, 10);
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
    		public void run() {
    			for(Player player : Bukkit.getOnlinePlayers()){
    				if(player != null){
    					ItemStack item = Utils.createItem(Material.WOOL, 1, 14, Utils.color("&eBarrage-1"), Arrays.asList(Utils.color(" "), Utils.color("&7Fight against other players"), Utils.color("&7in order to level up and gain"), Utils.color("&7some currency to compete with your friends"), Utils.color("&7and possibly a chance to win epic gear!"), Utils.color(" "), Utils.color("&8Join &a" + BungeeUtil.playerCountOfServer(player, servername) + " &8others"), Utils.color("&c█ &cClick to join this server")));
            			inv.setItem(20, item);
    				}
    			}
    		}
		}, 20);
    		}
		}, 0, 20);
	}
	
	public void Game2(final String servername){
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable(){
    		public void run() {
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
    		public void run() {
    			for(Player player : Bukkit.getOnlinePlayers()){
    				if(player != null){
    					ItemStack item = Utils.createItem(Material.WOOL, 1, 14, Utils.color("&eBarrage-2"), Arrays.asList(Utils.color(" "), Utils.color("&7Fight against other players"), Utils.color("&7in order to level up and gain"), Utils.color("&7some currency to compete with your friends"), Utils.color("&7and possibly a chance to win epic gear!"), Utils.color(" "), Utils.color("&8Join &a" + BungeeUtil.playerCountOfServer(player, servername) + " &8others"), Utils.color("&0█ &cClick to join this server")));
            			inv.setItem(22, item);
    				}
    			}
    		}
		}, 10);
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
    		public void run() {
    			for(Player player : Bukkit.getOnlinePlayers()){
    				if(player != null){
    					ItemStack item = Utils.createItem(Material.WOOL, 1, 14, Utils.color("&eBarrage-2"), Arrays.asList(Utils.color(" "), Utils.color("&7Fight against other players"), Utils.color("&7in order to level up and gain"), Utils.color("&7some currency to compete with your friends"), Utils.color("&7and possibly a chance to win epic gear!"), Utils.color(" "), Utils.color("&8Join &a" + BungeeUtil.playerCountOfServer(player, servername) + " &8others"), Utils.color("&c█ &cClick to join this server")));
            			inv.setItem(22, item);
    				}
    			}
    		}
		}, 20);
    		}
		}, 0, 20);
	}
	
	public void Game3(final String servername){
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable(){
    		public void run() {
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
    		public void run() {
    			for(Player player : Bukkit.getOnlinePlayers()){
    				if(player != null){
    					ItemStack item = Utils.createItem(Material.WOOL, 1, 14, Utils.color("&eBarrage-3"), Arrays.asList(Utils.color(" "), Utils.color("&7Fight against other players"), Utils.color("&7in order to level up and gain"), Utils.color("&7some currency to compete with your friends"), Utils.color("&7and possibly a chance to win epic gear!"), Utils.color(" "), Utils.color("&8Join &a" + BungeeUtil.playerCountOfServer(player, servername) + " &8others"), Utils.color("&0█ &cClick to join this server")));
            			inv.setItem(24, item);
    				}
    			}
    		}
		}, 10);
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
    		public void run() {
    			for(Player player : Bukkit.getOnlinePlayers()){
    				if(player != null){
    					ItemStack item = Utils.createItem(Material.WOOL, 1, 14, Utils.color("&eBarrage-3"), Arrays.asList(Utils.color(" "), Utils.color("&7Fight against other players"), Utils.color("&7in order to level up and gain"), Utils.color("&7some currency to compete with your friends"), Utils.color("&7and possibly a chance to win epic gear!"), Utils.color(" "), Utils.color("&8Join &a" + BungeeUtil.playerCountOfServer(player, servername) + " &8others"), Utils.color("&c█ &cClick to join this server")));
            			inv.setItem(24, item);
    				}
    			}
    		}
		}, 20);
    		}
		}, 0, 20);
	}
	
	@EventHandler
	public void menuClickEvent(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().equals(Utils.color("&8Realms"))){
			e.setCancelled(true);
			if(e.getWhoClicked() instanceof Player){
				if(e.getInventory() != null){
					if(!(e.getCurrentItem() == null)){
						if(!(e.getCurrentItem().getType() == Material.AIR)){
							
							if(e.getCurrentItem().getType().equals(Material.WOOL)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Utils.color("&eBarrage-1"))){
									e.setCancelled(true);
									BungeeUtil.sendToServer(p, "Game1");
									p.playSound(p.getLocation(), Sound.ENTITY_ENDERDRAGON_FLAP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.WOOL)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Utils.color("&eBarrage-2"))){
									e.setCancelled(true);
									BungeeUtil.sendToServer(p, "Game2");
									p.playSound(p.getLocation(), Sound.ENTITY_ENDERDRAGON_FLAP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.WOOL)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Utils.color("&eBarrage-3"))){
									e.setCancelled(true);
									BungeeUtil.sendToServer(p, "Game3");
									p.playSound(p.getLocation(), Sound.ENTITY_ENDERDRAGON_FLAP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							//BORDER
							if(e.getCurrentItem().getType().equals(Material.STAINED_GLASS_PANE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Utils.color(" "))){
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							
							
						}
					}
				}
			}
		}
	}

}
