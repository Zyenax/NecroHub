package net.necrohub.main.menus;

import java.util.Arrays;
import java.util.HashMap;

import net.necrocore.main.NecroCore;
import net.necrocore.main.SQL.SQLStacker;
import net.necrocore.main.SQL.SQLVisibility;
import net.necrocore.main.utils.Utils;
import net.necrohub.main.NecroHub;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitTask;

public class SettingsMenu implements Listener{
	
	public static Inventory inv;
	
	@SuppressWarnings("unused")
	private static NecroHub plugin;
	public SettingsMenu(NecroHub listener) {
		SettingsMenu.plugin = listener;	
	}
	
	static HashMap<Player, BukkitTask> MenuMap = new HashMap<Player, BukkitTask>();
	public static void Menu(final Player p){
		Inventory inventory = Bukkit.createInventory(null, 45, Utils.color("&8Settings"));
		inv = inventory;
		Border();
		p.openInventory(inv);
		p.updateInventory();
		Visibility(p, 21);
		Stacker(p, 23);
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
	
	public static void Visibility(Player p, Integer slotNumber){
		if(SQLVisibility.getVisibility(p).equals("true")){
			ItemStack t = Utils.createItem(Material.INK_SACK, 1, 10, Utils.color("&aPLAYER VISIBILITY"), Arrays.asList(Utils.color(" "), Utils.color("&7Choose whether or not"), Utils.color("&7to display the players"), Utils.color("&7in your lobby!"), Utils.color(" "), Utils.color("&ePlayer Visibility: &aTRUE")));
			inv.setItem(slotNumber, t);
		}else if(SQLVisibility.getVisibility(p).equals("false")){
			ItemStack f = Utils.createItem(Material.INK_SACK, 1, 1, Utils.color("&cPLAYER VISIBILITY"), Arrays.asList(Utils.color(" "), Utils.color("&7Choose whether or not"), Utils.color("&7to display the players"), Utils.color("&7in your lobby!"), Utils.color(" "), Utils.color("&ePlayer Visibility: &cFALSE")));
			inv.setItem(slotNumber, f);
		}
	}
	
	public static void Stacker(Player p, Integer slotNumber){
		if(SQLStacker.getStacker(p).equals("true")){
			ItemStack t = Utils.createItem(Material.INK_SACK, 1, 10, Utils.color("&aSTACKER"), Arrays.asList(Utils.color(" "), Utils.color("&7Choose whether or not"), Utils.color("&7to allow the players"), Utils.color("&7in your lobby to stack you!"), Utils.color(" "), Utils.color("&eStacker: &aTRUE")));
			inv.setItem(slotNumber, t);
		}else if(SQLStacker.getStacker(p).equals("false")){
			ItemStack f = Utils.createItem(Material.INK_SACK, 1, 1, Utils.color("&cSTACKER"), Arrays.asList(Utils.color(" "), Utils.color("&7Choose whether or not"), Utils.color("&7to allow the players"), Utils.color("&7in your lobby to stack you!"), Utils.color(" "), Utils.color("&eStacker: &cFALSE")));
			inv.setItem(slotNumber, f);
		}
	}
	
	@EventHandler
	public void menuClickEvent(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().equals(Utils.color("&8Settings"))){
			e.setCancelled(true);
			if(e.getWhoClicked() instanceof Player){
				if(e.getInventory() != null){
					if(!(e.getCurrentItem() == null)){
						if(!(e.getCurrentItem().getType() == Material.AIR)){
							
							if(e.getCurrentItem().getType().equals(Material.INK_SACK)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Utils.color("&aPLAYER VISIBILITY"))){
									e.setCancelled(true);
									SQLVisibility.setVisibility(p, "false");
									ItemStack f = Utils.createItem(Material.INK_SACK, 1, 1, Utils.color("&cPLAYER VISIBILITY"), Arrays.asList(Utils.color(" "), Utils.color("&7Choose whether or not"), Utils.color("&7to display the players"), Utils.color("&7in your lobby!"), Utils.color(" "), Utils.color("&ePlayer Visibility: &cFALSE")));
									inv.setItem(21, f);
									p.updateInventory();
									for(Player player : Bukkit.getOnlinePlayers()){
										p.hidePlayer(player);
									}
									p.sendMessage(Utils.color(NecroCore.name + " &ePlayer Visibility has been toggled to be &c&lOFF"));
									p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Utils.color("&cPLAYER VISIBILITY"))){
									e.setCancelled(true);
									SQLVisibility.setVisibility(p, "true");
									ItemStack t = Utils.createItem(Material.INK_SACK, 1, 10, Utils.color("&aPLAYER VISIBILITY"), Arrays.asList(Utils.color(" "), Utils.color("&7Choose whether or not"), Utils.color("&7to display the players"), Utils.color("&7in your lobby!"), Utils.color(" "), Utils.color("&ePlayer Visibility: &aTRUE")));
									inv.setItem(21, t);
									for(Player player : Bukkit.getOnlinePlayers()){
										p.showPlayer(player);
									}
									p.updateInventory();
									p.sendMessage(Utils.color(NecroCore.name + " &ePlayer Visibility has been toggled to be &a&lON"));
									p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.INK_SACK)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Utils.color("&aSTACKER"))){
									e.setCancelled(true);
									SQLStacker.setStacker(p, "false");
									ItemStack f = Utils.createItem(Material.INK_SACK, 1, 1, Utils.color("&cSTACKER"), Arrays.asList(Utils.color(" "), Utils.color("&7Choose whether or not"), Utils.color("&7to allow the players"), Utils.color("&7in your lobby to stack you!"), Utils.color(" "), Utils.color("&eStacker: &cFALSE")));
									inv.setItem(23, f);
									p.updateInventory();
									p.sendMessage(Utils.color(NecroCore.name + " &ePlayer Stacking has been toggled to be &c&lOFF"));
									p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Utils.color("&cSTACKER"))){
									e.setCancelled(true);
									SQLStacker.setStacker(p, "true");
									ItemStack t = Utils.createItem(Material.INK_SACK, 1, 10, Utils.color("&aSTACKER"), Arrays.asList(Utils.color(" "), Utils.color("&7Choose whether or not"), Utils.color("&7to allow the players"), Utils.color("&7in your lobby to stack you!"), Utils.color(" "), Utils.color("&eStacker: &aTRUE")));
									inv.setItem(23, t);
									p.updateInventory();
									p.sendMessage(Utils.color(NecroCore.name + " &ePlayer Stacking has been toggled to be &a&lON"));
									p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							//BORDER
							if(e.getCurrentItem().getType().equals(Material.STAINED_GLASS_PANE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Utils.color(" "))){
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							
							
						}
					}
				}
			}
		}
	}

}
