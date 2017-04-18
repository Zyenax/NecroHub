package net.necrohub.main.handlers;

import net.necrocore.main.NecroCore;
import net.necrocore.main.SQL.SQLStacker;
import net.necrocore.main.utils.Utils;
import net.necrohub.main.NecroHub;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.spigotmc.event.entity.EntityDismountEvent;

public class StackHandler implements Listener{
	
	@SuppressWarnings("unused")
	private NecroHub plugin;
	public StackHandler(NecroHub necroHub) {
		this.plugin = necroHub;		
	}
	
	@EventHandler
	public void stack(PlayerInteractEntityEvent e){
		if(e.getRightClicked() instanceof Player){
			if(e.getHand() == EquipmentSlot.HAND){
			Player stacker = e.getPlayer();
			Player stacking = (Player) e.getRightClicked();
			if(SQLStacker.getStacker(stacking).equalsIgnoreCase("false")){
				stacker.sendMessage(Utils.color(NecroCore.name + " &eThis player has stacking set to &c&lOFF"));
				e.setCancelled(true);
			}else if(SQLStacker.getStacker(stacking).equalsIgnoreCase("true")){
				if(SQLStacker.getStacker(stacker).equalsIgnoreCase("true")){
					stacker.sendMessage(Utils.color(NecroCore.name + " &eYou have stacked &c" + stacking.getName()));
					stacking.sendMessage(Utils.color(NecroCore.name + " &eYou have been stacked by &c" + stacker.getName()));
					stacker.setPassenger(stacking);
					for(Player player : Bukkit.getOnlinePlayers()){
						player.hidePlayer(stacking);
						player.hidePlayer(stacker);
						player.showPlayer(stacking);
						player.showPlayer(stacker);
					}
					e.setCancelled(true);
				}else if(SQLStacker.getStacker(stacker).equalsIgnoreCase("false")){
					stacker.sendMessage(Utils.color(NecroCore.name + " &eYou have stacking set to &c&lOFF"));
					e.setCancelled(true);
				}
			}
			}
		}
	}
	
	@EventHandler
	public void dismount(EntityDismountEvent e){
		if(e.getEntity() instanceof Player){
			if(e.getDismounted() instanceof Player){
				Player dismounter = (Player) e.getEntity();
				Player dismounting = (Player) e.getDismounted();
				for(Player player : Bukkit.getOnlinePlayers()){
					player.hidePlayer(dismounting);
					player.hidePlayer(dismounter);
					player.showPlayer(dismounting);
					player.showPlayer(dismounter);
				}
				dismounting.sendMessage(Utils.color(NecroCore.name + " &c" + dismounter.getName() + " &ehas dismounted you!"));
				dismounter.sendMessage(Utils.color(NecroCore.name + " &eYou have dismounted &c" + dismounting.getName()));
			}
		}
	}
	
	@EventHandler
	public void settingsmenu(PlayerInteractEvent e) {
		if (e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK) {
			if(e.getPlayer().getPassenger() != null){
				if(e.getPlayer().getPassenger() instanceof Player){
					Player launcher = (Player)e.getPlayer();
					Player launching = (Player)e.getPlayer().getPassenger();
					launching.leaveVehicle();
					launching.setVelocity(launcher.getLocation().getDirection().multiply(2).setY(1));
					for(Player player : Bukkit.getOnlinePlayers()){
						player.hidePlayer(launching);
						player.hidePlayer(launcher);
						player.showPlayer(launching);
						player.showPlayer(launcher);
					}
					launching.sendMessage(Utils.color(NecroCore.name + " &c" + launcher.getName() + " &ehas launched you!"));
					launcher.sendMessage(Utils.color(NecroCore.name + " &eYou have launched &c" + launching.getName()));
				}
			}
		}
	}

}
