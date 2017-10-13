package net.blizmc.rpg.utils;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public class UserFiles {

	static UserFiles instance = new UserFiles();

	public static UserFiles getInstance() {
		return instance;
	}
	
	FileConfiguration users;
	File ufile;
	
	public void setup(Plugin p) {
		ufile = new File(getDirectory(p), "users.yml");
		
		if (!ufile.exists()) {
			try {
				ufile.createNewFile();
			} catch (IOException e) {
				Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not create users.yml!");
			}
		}
		
		users = YamlConfiguration.loadConfiguration(ufile);
	}
	
	public FileConfiguration getUsers() {
		return users;
	}
	
	public void saveUsers() {
		try {
			users.save(ufile);
		} catch (IOException e) {
			Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not save users.yml!");
		}
	}
	
	public File getDirectory(Plugin p) {
		String path = p.getDataFolder().getAbsolutePath();
		File dir = new File(path + File.separator + "userdata");
		if(!dir.exists()) dir.mkdirs();
		return dir;
	}	
}
