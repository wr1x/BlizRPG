package net.blizmc.rpg;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import net.blizmc.rpg.listeners.player.PlayerInventoryClick;
import net.blizmc.rpg.listeners.player.PlayerLogin;
import net.blizmc.rpg.utils.ConfigManager;
import net.blizmc.rpg.utils.NPCManager;
import net.blizmc.rpg.utils.UserFiles;
import net.blizmc.rpg.utils.classes.ClassManager;

public class BlizRPG extends JavaPlugin{

	private PluginManager pm = Bukkit.getServer().getPluginManager();
	
	private static BlizRPG instance;
	
	public static BlizRPG getInstance() {
		return instance;
	}

	private void setInstance(BlizRPG instance) {
		BlizRPG.instance = instance;
	}
	
	@Override
	public void onEnable() {
		setInstance(this);
		
		ConfigManager.getInstance().settings();
		getConfig().options().copyDefaults(true);
		saveConfig();
		
		UserFiles.getInstance().setup(this);
		
		ClassManager.getInstance().onEnable();
		
		register_listeners();
		
		NPCManager.getInstance().load_npc_list();
	}
	
	@Override
	public void onDisable() {
		
	}
	
	private void register_listeners() {
		pm.registerEvents(new PlayerLogin(), this);
		pm.registerEvents(new PlayerInventoryClick(), this);
	}
	
}
