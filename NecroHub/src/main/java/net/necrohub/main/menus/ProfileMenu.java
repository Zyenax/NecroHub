package net.necrohub.main.menus;

import java.util.Arrays;
import java.util.HashMap;

import net.necrocore.main.NecroCore;
import net.necrocore.main.SQL.SQLMeteors;
import net.necrocore.main.SQL.SQLNetworkLevels;
import net.necrocore.main.SQL.SQLRanks;
import net.necrocore.main.SQL.SQLShards;
import net.necrocore.main.handlers.Rank;
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

public class ProfileMenu implements Listener{
	
	public static Inventory inv;
	
	@SuppressWarnings("unused")
	private static NecroHub plugin;
	public ProfileMenu(NecroHub listener) {
		ProfileMenu.plugin = listener;	
	}
	
	static HashMap<Player, BukkitTask> MenuMap = new HashMap<Player, BukkitTask>();
	public static void Menu(final Player p){
		Inventory inventory = Bukkit.createInventory(null, 45, Utils.color("&8Profile"));
		inv = inventory;
		Border();
		p.openInventory(inv);
		p.updateInventory();
		PlayerHead(p, 22);
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
	
	public static void PlayerHead(Player p, Integer slotNumber){
		if(SQLRanks.getRank(p).equals(Rank.OWNER.getName())){
			if(SQLNetworkLevels.getXPProgress(p) < 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.OWNER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&7██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 20 && SQLNetworkLevels.getXPProgress(p) > 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.OWNER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█&7█████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 30 && SQLNetworkLevels.getXPProgress(p) > 20){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.OWNER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██&7████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 40 && SQLNetworkLevels.getXPProgress(p) > 30){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.OWNER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███&7███████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 50 && SQLNetworkLevels.getXPProgress(p) > 40){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.OWNER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████&7██████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 60 && SQLNetworkLevels.getXPProgress(p) > 50){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.OWNER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████&7█████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 70 && SQLNetworkLevels.getXPProgress(p) > 60){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.OWNER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████&7████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 80 && SQLNetworkLevels.getXPProgress(p) > 70){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.OWNER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███████&7███" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 90 && SQLNetworkLevels.getXPProgress(p) > 80){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.OWNER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████████&7██" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) < 100 && SQLNetworkLevels.getXPProgress(p) > 90){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.OWNER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████████&7█" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) == 100){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.OWNER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}
		}else if(SQLRanks.getRank(p).equals(Rank.ADMIN.getName())){
			if(SQLNetworkLevels.getXPProgress(p) < 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.ADMIN.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&7██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 20 && SQLNetworkLevels.getXPProgress(p) > 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.ADMIN.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█&7█████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 30 && SQLNetworkLevels.getXPProgress(p) > 20){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.ADMIN.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██&7████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 40 && SQLNetworkLevels.getXPProgress(p) > 30){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.ADMIN.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███&7███████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 50 && SQLNetworkLevels.getXPProgress(p) > 40){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.ADMIN.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████&7██████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 60 && SQLNetworkLevels.getXPProgress(p) > 50){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.ADMIN.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████&7█████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 70 && SQLNetworkLevels.getXPProgress(p) > 60){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.ADMIN.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████&7████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 80 && SQLNetworkLevels.getXPProgress(p) > 70){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.ADMIN.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███████&7███" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 90 && SQLNetworkLevels.getXPProgress(p) > 80){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.ADMIN.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████████&7██" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) < 100 && SQLNetworkLevels.getXPProgress(p) > 90){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.ADMIN.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████████&7█" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) == 100){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.ADMIN.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}
		}else if(SQLRanks.getRank(p).equals(Rank.SRMOD.getName())){
			if(SQLNetworkLevels.getXPProgress(p) < 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.SRMOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&7██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 20 && SQLNetworkLevels.getXPProgress(p) > 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.SRMOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█&7█████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 30 && SQLNetworkLevels.getXPProgress(p) > 20){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.SRMOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██&7████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 40 && SQLNetworkLevels.getXPProgress(p) > 30){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.SRMOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███&7███████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 50 && SQLNetworkLevels.getXPProgress(p) > 40){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.SRMOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████&7██████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 60 && SQLNetworkLevels.getXPProgress(p) > 50){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.SRMOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████&7█████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 70 && SQLNetworkLevels.getXPProgress(p) > 60){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.SRMOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████&7████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 80 && SQLNetworkLevels.getXPProgress(p) > 70){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.SRMOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███████&7███" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 90 && SQLNetworkLevels.getXPProgress(p) > 80){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.SRMOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████████&7██" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) < 100 && SQLNetworkLevels.getXPProgress(p) > 90){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.SRMOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████████&7█" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) == 100){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.SRMOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}
		}else if(SQLRanks.getRank(p).equals(Rank.MOD.getName())){
			if(SQLNetworkLevels.getXPProgress(p) < 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.MOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&7██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 20 && SQLNetworkLevels.getXPProgress(p) > 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.MOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█&7█████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 30 && SQLNetworkLevels.getXPProgress(p) > 20){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.MOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██&7████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 40 && SQLNetworkLevels.getXPProgress(p) > 30){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.MOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███&7███████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 50 && SQLNetworkLevels.getXPProgress(p) > 40){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.MOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████&7██████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 60 && SQLNetworkLevels.getXPProgress(p) > 50){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.MOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████&7█████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 70 && SQLNetworkLevels.getXPProgress(p) > 60){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.MOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████&7████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 80 && SQLNetworkLevels.getXPProgress(p) > 70){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.MOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███████&7███" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 90 && SQLNetworkLevels.getXPProgress(p) > 80){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.MOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████████&7██" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) < 100 && SQLNetworkLevels.getXPProgress(p) > 90){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.MOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████████&7█" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) == 100){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.MOD.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}
		}else if(SQLRanks.getRank(p).equals(Rank.HELPER.getName())){
			if(SQLNetworkLevels.getXPProgress(p) < 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.HELPER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&7██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 20 && SQLNetworkLevels.getXPProgress(p) > 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.HELPER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█&7█████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 30 && SQLNetworkLevels.getXPProgress(p) > 20){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.HELPER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██&7████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 40 && SQLNetworkLevels.getXPProgress(p) > 30){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.HELPER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███&7███████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 50 && SQLNetworkLevels.getXPProgress(p) > 40){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.HELPER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████&7██████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 60 && SQLNetworkLevels.getXPProgress(p) > 50){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.HELPER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████&7█████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 70 && SQLNetworkLevels.getXPProgress(p) > 60){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.HELPER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████&7████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 80 && SQLNetworkLevels.getXPProgress(p) > 70){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.HELPER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███████&7███" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 90 && SQLNetworkLevels.getXPProgress(p) > 80){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.HELPER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████████&7██" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) < 100 && SQLNetworkLevels.getXPProgress(p) > 90){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.HELPER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████████&7█" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) == 100){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.HELPER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}
		}else if(SQLRanks.getRank(p).equals(Rank.BUILDER.getName())){
			if(SQLNetworkLevels.getXPProgress(p) < 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.BUILDER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&7██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 20 && SQLNetworkLevels.getXPProgress(p) > 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.BUILDER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█&7█████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 30 && SQLNetworkLevels.getXPProgress(p) > 20){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.BUILDER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██&7████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 40 && SQLNetworkLevels.getXPProgress(p) > 30){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.BUILDER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███&7███████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 50 && SQLNetworkLevels.getXPProgress(p) > 40){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.BUILDER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████&7██████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 60 && SQLNetworkLevels.getXPProgress(p) > 50){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.BUILDER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████&7█████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 70 && SQLNetworkLevels.getXPProgress(p) > 60){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.BUILDER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████&7████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 80 && SQLNetworkLevels.getXPProgress(p) > 70){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.BUILDER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███████&7███" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 90 && SQLNetworkLevels.getXPProgress(p) > 80){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.BUILDER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████████&7██" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) < 100 && SQLNetworkLevels.getXPProgress(p) > 90){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.BUILDER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████████&7█" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) == 100){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.BUILDER.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}
		}else if(SQLRanks.getRank(p).equals(Rank.DONOR3.getName())){
			if(SQLNetworkLevels.getXPProgress(p) < 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR3.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&7██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 20 && SQLNetworkLevels.getXPProgress(p) > 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR3.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█&7█████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 30 && SQLNetworkLevels.getXPProgress(p) > 20){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR3.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██&7████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 40 && SQLNetworkLevels.getXPProgress(p) > 30){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR3.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███&7███████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 50 && SQLNetworkLevels.getXPProgress(p) > 40){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR3.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████&7██████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 60 && SQLNetworkLevels.getXPProgress(p) > 50){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR3.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████&7█████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 70 && SQLNetworkLevels.getXPProgress(p) > 60){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR3.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████&7████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 80 && SQLNetworkLevels.getXPProgress(p) > 70){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR3.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███████&7███" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 90 && SQLNetworkLevels.getXPProgress(p) > 80){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR3.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████████&7██" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) < 100 && SQLNetworkLevels.getXPProgress(p) > 90){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR3.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████████&7█" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) == 100){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR3.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}
		}else if(SQLRanks.getRank(p).equals(Rank.DONOR2.getName())){
			if(SQLNetworkLevels.getXPProgress(p) < 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR2.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&7██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 20 && SQLNetworkLevels.getXPProgress(p) > 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR2.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█&7█████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 30 && SQLNetworkLevels.getXPProgress(p) > 20){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR2.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██&7████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 40 && SQLNetworkLevels.getXPProgress(p) > 30){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR2.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███&7███████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 50 && SQLNetworkLevels.getXPProgress(p) > 40){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR2.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████&7██████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 60 && SQLNetworkLevels.getXPProgress(p) > 50){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR2.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████&7█████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 70 && SQLNetworkLevels.getXPProgress(p) > 60){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR2.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████&7████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 80 && SQLNetworkLevels.getXPProgress(p) > 70){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR2.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███████&7███" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 90 && SQLNetworkLevels.getXPProgress(p) > 80){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR2.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████████&7██" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) < 100 && SQLNetworkLevels.getXPProgress(p) > 90){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR2.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████████&7█" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) == 100){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR2.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}
		}else if(SQLRanks.getRank(p).equals(Rank.DONOR1.getName())){
			if(SQLNetworkLevels.getXPProgress(p) < 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR1.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&7██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 20 && SQLNetworkLevels.getXPProgress(p) > 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR1.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█&7█████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 30 && SQLNetworkLevels.getXPProgress(p) > 20){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR1.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██&7████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 40 && SQLNetworkLevels.getXPProgress(p) > 30){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR1.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███&7███████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 50 && SQLNetworkLevels.getXPProgress(p) > 40){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR1.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████&7██████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 60 && SQLNetworkLevels.getXPProgress(p) > 50){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR1.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████&7█████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 70 && SQLNetworkLevels.getXPProgress(p) > 60){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR1.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████&7████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 80 && SQLNetworkLevels.getXPProgress(p) > 70){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR1.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███████&7███" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 90 && SQLNetworkLevels.getXPProgress(p) > 80){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR1.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████████&7██" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) < 100 && SQLNetworkLevels.getXPProgress(p) > 90){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR1.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████████&7█" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) == 100){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DONOR1.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}
		}else if(SQLRanks.getRank(p).equals(Rank.DEFAULT.getName())){
			if(SQLNetworkLevels.getXPProgress(p) < 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DEFAULT.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&7██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 20 && SQLNetworkLevels.getXPProgress(p) > 10){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DEFAULT.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█&7█████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 30 && SQLNetworkLevels.getXPProgress(p) > 20){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DEFAULT.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██&7████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 40 && SQLNetworkLevels.getXPProgress(p) > 30){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DEFAULT.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███&7███████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 50 && SQLNetworkLevels.getXPProgress(p) > 40){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DEFAULT.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████&7██████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 60 && SQLNetworkLevels.getXPProgress(p) > 50){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DEFAULT.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████&7█████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 70 && SQLNetworkLevels.getXPProgress(p) > 60){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DEFAULT.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████&7████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 80 && SQLNetworkLevels.getXPProgress(p) > 70){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DEFAULT.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b███████&7███" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) <= 90 && SQLNetworkLevels.getXPProgress(p) > 80){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DEFAULT.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b████████&7██" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) < 100 && SQLNetworkLevels.getXPProgress(p) > 90){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DEFAULT.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b█████████&7█" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}else if(SQLNetworkLevels.getXPProgress(p) == 100){
				ItemStack profile = Utils.createSkull(p.getName(), Utils.color("&b" + p.getName() + "'s Profile"), Arrays.asList(Utils.color(" "), Utils.color("&7Rank: " + Rank.DEFAULT.getColor() + SQLRanks.getRank(p)), Utils.color("&7Shards: &5" + SQLShards.getShards(p)), Utils.color("&7Meteors: &a" + SQLMeteors.getMeteors(p)), Utils.color("&7Level: &6" + SQLNetworkLevels.getLevel(p)), Utils.color("&7Experience: &e" + SQLNetworkLevels.getXP(p) + "&a/&e" + SQLNetworkLevels.getXPNeeded(p)), Utils.color("&7Experience Progress:"), Utils.color("&b██████████" + " &b" + SQLNetworkLevels.getXPProgress(p) + "%"), Utils.color(" "), Utils.color("&eClick to view the store link!")));
				inv.setItem(slotNumber, profile);
			}
		}
	}
	
	@EventHandler
	public void menuClickEvent(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().equals(Utils.color("&8Profile"))){
			e.setCancelled(true);
			if(e.getWhoClicked() instanceof Player){
				if(e.getInventory() != null){
					if(!(e.getCurrentItem() == null)){
						if(!(e.getCurrentItem().getType() == Material.AIR)){
							
							if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(Utils.color("&b" + p.getName() + "'s Profile"))){
									e.setCancelled(true);
									p.sendMessage(Utils.color(NecroCore.name + " &estore.necrocube.net"));
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
