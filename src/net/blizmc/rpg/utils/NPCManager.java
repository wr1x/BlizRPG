package net.blizmc.rpg.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Villager.Profession;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.md_5.bungee.api.ChatColor;

public class NPCManager {

	private static NPCManager instance = new NPCManager();

	public static NPCManager getInstance() {
		return instance;
	}
	
	public void create_npc(Location l, String name) {
		Block block = l.getBlock();
		Entity npc = block.getWorld().spawn(block.getLocation(), Villager.class);
		((Villager)npc).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10000, 128));
		((Villager)npc).addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 100000, 6));	
		((Villager)npc).setCustomName(name);
		((Villager)npc).setCustomNameVisible(true);
		((Villager)npc).setProfession(Profession.BLACKSMITH);
		((Villager)npc).setMaxHealth(600);
		((Villager)npc).setHealth(600);
		((Villager)npc).setAdult();
	}
	
	public void load_npc_list() {
		create_npc(new Location(Bukkit.getWorlds().get(0), 1, 70, 1), ChatColor.RED+"Vampire Klaka");
	}
}
