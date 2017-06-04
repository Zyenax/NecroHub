package net.necrohub.main.handlers;

import net.necrocore.main.utils.Utils;
import net.necrohub.main.NecroHub;
import net.necrohub.main.menus.GameMenu;
import net.necrohub.main.menus.ProfileMenu;
import net.necrohub.main.menus.SettingsMenu;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ItemHandler implements Listener {
	@SuppressWarnings("unused")
	private NecroHub plugin;

	public ItemHandler(NecroHub hub) {
		this.plugin = hub;
	}

	@EventHandler
	public void gamemenu(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK
				|| e.getAction() == Action.RIGHT_CLICK_AIR) {
			if (e.getPlayer().getItemInHand() != null) {
				if (e.getPlayer().getItemInHand().getType() == Material.COMPASS) {
					if(e.getPlayer().getItemInHand().hasItemMeta()){
						if(e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(Utils.color("&cRealm Selector &7- &eRight Click"))){
							GameMenu.Menu(e.getPlayer());
						}
					}
				}
			}
		}
	}
	
	@EventHandler
	public void profilemenu(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK
				|| e.getAction() == Action.RIGHT_CLICK_AIR) {
			if (e.getPlayer().getItemInHand() != null) {
				if (e.getPlayer().getItemInHand().getType() == Material.SKULL_ITEM) {
					if(e.getPlayer().getItemInHand().hasItemMeta()){
						if(e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(Utils.color("&cProfile Menu &7- &eRight Click"))){
							ProfileMenu.Menu(e.getPlayer());
						}
					}
				}
			}
		}
	}
	
	@EventHandler
	public void settingsmenu(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK
				|| e.getAction() == Action.RIGHT_CLICK_AIR) {
			if (e.getPlayer().getItemInHand() != null) {
				if (e.getPlayer().getItemInHand().getType() == Material.NAME_TAG) {
					if(e.getPlayer().getItemInHand().hasItemMeta()){
						if(e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(Utils.color("&cSettings Menu &7- &eRight Click"))){
							SettingsMenu.Menu(e.getPlayer());
						}
					}
				}
			}
		}
	}
}