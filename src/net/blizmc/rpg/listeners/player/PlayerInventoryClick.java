package net.blizmc.rpg.listeners.player;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import net.blizmc.rpg.gui.ClassSelector;
import net.blizmc.rpg.utils.KitManager;
import net.blizmc.rpg.utils.classes.ClassManager;
import net.blizmc.rpg.utils.classes.Classes;

public class PlayerInventoryClick implements Listener{

	@EventHandler
	public void onInvClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		ItemStack clicked_item = e.getCurrentItem();
		Inventory inv = e.getInventory();
		if(inv.getName().equals(ClassSelector.getInstance().inventory_name())) {
			e.setCancelled(true);
			//Vampire clicked
			if(clicked_item.getType() == Material.BONE) {
				ClassManager.getInstance().set_class(p, Classes.VAMPIRE);
				p.closeInventory();
				
				String class_name = ClassManager.getInstance().get_class_name(p);
				ClassManager.getInstance().set_player_prefix(p, class_name);
			}
			//Vampire Hunter Clicked
			if(clicked_item.getType() == Material.GOLD_SWORD) {
				ClassManager.getInstance().set_class(p, Classes.VAMPIRE);
				p.closeInventory();
				
				String class_name = ClassManager.getInstance().get_class_name(p);
				ClassManager.getInstance().set_player_prefix(p, class_name);
			}
			
			//Knight Clicked
			if(clicked_item.getType() == Material.IRON_CHESTPLATE) {
				ClassManager.getInstance().set_class(p, Classes.KNIGHT);
				p.closeInventory();
			}
			
			//Orc Clicked
			if(clicked_item.getType() == Material.STONE_AXE) {
				ClassManager.getInstance().set_class(p, Classes.ORC);
				p.closeInventory();
				
				String class_name = ClassManager.getInstance().get_class_name(p);
				ClassManager.getInstance().set_player_prefix(p, class_name);
			}
			
			//Elf Clicked
			if(clicked_item.getType() == Material.STICK) {
				ClassManager.getInstance().set_class(p, Classes.ELF);
				p.closeInventory();
				
				String class_name = ClassManager.getInstance().get_class_name(p);
				ClassManager.getInstance().set_player_prefix(p, class_name);
			}
			p.getInventory().clear();
			KitManager.getInstance().give_kit(p);
		}
	}
	
}
