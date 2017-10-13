package net.blizmc.rpg.gui;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import net.blizmc.rpg.utils.classes.Classes;

public class ClassSelector extends GuiManager{

	private static ClassSelector instance = new ClassSelector();

	public static ClassSelector getInstance() {
		return instance;
	}
	
	private String name = "Class Selector";
	
	public void class_window(Player p) {
		Inventory inv = inventory_window(p, 9, name);
		
		ArrayList<String> lore = new ArrayList<>();
		
		//Vampire Class
		lore.add(ChatColor.GREEN+"Left-Click to become a "+Classes.VAMPIRE.getName());
		lore.add("");
		lore.add(ChatColor.RED+"About: "+ChatColor.WHITE+Classes.VAMPIRE.getAbout());
		set_item_to_window(inv, 2, Material.BONE, 1, Classes.VAMPIRE.getName(),ChatColor.RED, lore);
		lore.clear();
		
		//Vampire Hunter Class
		lore.add(ChatColor.GREEN+"Left-Click to become a "+Classes.VAMPIRE_HUNTER.getName());
		lore.add("");
		lore.add(ChatColor.RED+"About: "+ChatColor.WHITE+Classes.VAMPIRE_HUNTER.getAbout());
		set_item_to_window(inv, 3, Material.GOLD_SWORD, 1, Classes.VAMPIRE_HUNTER.getName(),ChatColor.DARK_RED, lore);
		lore.clear();
		
		//Knight Class
		lore.add(ChatColor.GREEN+"Left-Click to become a "+Classes.KNIGHT.getName());
		lore.add("");
		lore.add(ChatColor.RED+"About: "+ChatColor.WHITE+Classes.KNIGHT.getAbout());
		set_item_to_window(inv, 4, Material.IRON_CHESTPLATE, 1, Classes.KNIGHT.getName(),ChatColor.GRAY, lore);
		lore.clear();
		
		//Orc Class
		lore.add(ChatColor.GREEN+"Left-Click to become a "+Classes.ORC.getName());
		lore.add("");
		lore.add(ChatColor.RED+"About: "+ChatColor.WHITE+Classes.ORC.getAbout());
		set_item_to_window(inv, 5, Material.STONE_AXE, 1, Classes.ORC.getName(),ChatColor.DARK_GREEN, lore);
		lore.clear();
		
		//Elf Class
		lore.add(ChatColor.GREEN+"Left-Click to become a "+Classes.ELF.getName());
		lore.add("");
		lore.add(ChatColor.RED+"About: "+ChatColor.WHITE+Classes.ELF.getAbout());
		set_item_to_window(inv, 6, Material.STICK, 1, Classes.ELF.getName(),ChatColor.LIGHT_PURPLE, lore);
		lore.clear();
		
		open_inventory_window(p, inv);
	}
	
	public String inventory_name() {
		return name;
	}
}
