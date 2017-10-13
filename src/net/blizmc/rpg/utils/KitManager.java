package net.blizmc.rpg.utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.blizmc.rpg.utils.classes.ClassManager;
import net.blizmc.rpg.utils.classes.Classes;
import net.md_5.bungee.api.ChatColor;

public class KitManager {

	private static KitManager instance = new KitManager();

	public static KitManager getInstance() {
		return instance;
	}
	
	public void give_kit(Player p) {
		Inventory inv = p.getInventory();
		List<String> lore = new ArrayList<>();
		
		//This is just test kits
		
		//Vampire Kit
		if(ClassManager.getInstance().get_class_name(p).equals(Classes.VAMPIRE.getName())) {
			ItemStack sword = new ItemStack(Material.STONE_SWORD, 1);
			ItemMeta sword_meta = sword.getItemMeta();
			sword_meta.setDisplayName(ChatColor.GRAY+"Vampire Sword "+ChatColor.YELLOW+"(Lvl.1)");
			//Enchantments ideas
			lore.add(ChatColor.RED+"Strengh");
			lore.add(ChatColor.RED+"Blood");
			lore.add(ChatColor.RED+"Potion");
			sword_meta.setLore(lore);
			sword.setItemMeta(sword_meta);
			inv.setItem(0, sword);
		}
		
		//Vampire Hunter Kit
		if(ClassManager.getInstance().get_class_name(p).equals(Classes.VAMPIRE_HUNTER.getName())) {
			
		}
		
		//Knight Kit
		if(ClassManager.getInstance().get_class_name(p).equals(Classes.KNIGHT.getName())) {
			
		}
		
		//Orc Kit
		if(ClassManager.getInstance().get_class_name(p).equals(Classes.ORC.getName())) {
			
		}
		
		//Elf Kit
		if(ClassManager.getInstance().get_class_name(p).equals(Classes.ELF.getName())) {
			
		}
	}
	
}
