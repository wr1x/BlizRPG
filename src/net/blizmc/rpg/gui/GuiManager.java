package net.blizmc.rpg.gui;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GuiManager {
	
	protected Inventory inventory_window(Player p, int size, String name) {
		return Bukkit.createInventory(null, size, name);
	}
	
	protected void set_item_to_window(Inventory inv, int slot, Material item, int amount, String name,ChatColor name_color, ArrayList<String> lore) {
		ItemStack item_stack = new ItemStack(item, amount);
		ItemMeta item_meta = item_stack.getItemMeta();
				
		item_meta.setDisplayName(name_color + name);
		item_meta.setLore(lore);
		item_stack.setItemMeta(item_meta);
		inv.setItem(slot, item_stack);
	}
	
	protected void open_inventory_window(Player p, Inventory inv) {
		p.openInventory(inv);
	}
} 
