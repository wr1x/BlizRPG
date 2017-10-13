package net.blizmc.rpg.listeners.player;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import net.blizmc.rpg.BlizRPG;
import net.blizmc.rpg.utils.classes.ClassManager;

public class PlayerLogin implements Listener{

	@EventHandler
	public void onLogin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		//Check if the player has choosen a class
		if(!ClassManager.getInstance().has_class(p)) {
			//Player has no class
			//The runnable is beacuse minecraft wont let you open an inventory on join
			Bukkit.getScheduler().runTaskLater(BlizRPG.getInstance(), new Runnable() {
				@Override
				public void run() {
					ClassManager.getInstance().open_class_menu(p);
				}
			}, 20L);
		}else {
			//Player has a class
			String class_name = ClassManager.getInstance().get_class_name(p);
			ClassManager.getInstance().set_player_prefix(p, class_name);
		}
	}
	
}
