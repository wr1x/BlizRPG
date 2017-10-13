package net.blizmc.rpg.listeners.player;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import net.blizmc.rpg.gui.ClassSelector;
import net.blizmc.rpg.utils.ChatFormat;
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
				
				ChatFormat.getInstance().npc_message(p, "Vampire King", "Hello, "+p.getName()+"!");
				ChatFormat.getInstance().npc_message(p, "Vampire King", "Let me teleport you to our kingdom.");
				//Add some cool effects
				p.teleport(new Location(Bukkit.getWorld("world"), 1, 70, 1));
				
			}
			//Vampire Hunter Clicked
			if(clicked_item.getType() == Material.GOLD_SWORD) {
				ClassManager.getInstance().set_class(p, Classes.VAMPIRE);
				p.closeInventory();
				
				String class_name = ClassManager.getInstance().get_class_name(p);
				ClassManager.getInstance().set_player_prefix(p, class_name);
				
				ChatFormat.getInstance().npc_message(p, "King", "Hello, "+p.getName()+"!");
				ChatFormat.getInstance().npc_message(p, "King", "Let me teleport you to the Vampire Hunter house.");
				//Add some cool effects
				p.teleport(new Location(Bukkit.getWorld("world"), 1, 70, 1));
			}
			
			//Knight Clicked
			if(clicked_item.getType() == Material.IRON_CHESTPLATE) {
				ClassManager.getInstance().set_class(p, Classes.KNIGHT);
				p.closeInventory();
				
				String class_name = ClassManager.getInstance().get_class_name(p);
				ClassManager.getInstance().set_player_prefix(p, class_name);
				
				ChatFormat.getInstance().npc_message(p, "King", "Hello, "+p.getName()+"!");
				ChatFormat.getInstance().npc_message(p, "King", "Let me teleport you to the our kingdom.");
				//Add some cool effects
				p.teleport(new Location(Bukkit.getWorld("world"), 1, 70, 1));
			}
			
			//Orc Clicked
			if(clicked_item.getType() == Material.STONE_AXE) {
				ClassManager.getInstance().set_class(p, Classes.ORC);
				p.closeInventory();
				
				String class_name = ClassManager.getInstance().get_class_name(p);
				ClassManager.getInstance().set_player_prefix(p, class_name);
				
				ChatFormat.getInstance().npc_message(p, "Orc Leader", "Hello, "+p.getName()+"!");
				ChatFormat.getInstance().npc_message(p, "Orc Leader", "Let me teleport you to the orc camp.");
				//Add some cool effects
				p.teleport(new Location(Bukkit.getWorld("world"), 1, 70, 1));
			}
			
			//Elf Clicked
			if(clicked_item.getType() == Material.STICK) {
				ClassManager.getInstance().set_class(p, Classes.ELF);
				p.closeInventory();
				
				String class_name = ClassManager.getInstance().get_class_name(p);
				ClassManager.getInstance().set_player_prefix(p, class_name);
				
				ChatFormat.getInstance().npc_message(p, "Elf Queen", "Hello, "+p.getName()+"!");
				ChatFormat.getInstance().npc_message(p, "Elf Queen", "Let me teleport you to the elf camp.");
				//Add some cool effects
				p.teleport(new Location(Bukkit.getWorld("world"), 1, 70, 1));
			}
		}
	}
	
}
