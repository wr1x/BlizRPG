package net.blizmc.rpg.utils;

import java.io.File;

import org.bukkit.plugin.Plugin;

public class LangFiles {

	static LangFiles instance = new LangFiles();

	public static LangFiles getInstance() {
		return instance;
	}
	
	public void setup(Plugin p) {
		
	}
	
	public File getDirectory(Plugin p) {
		String path = p.getDataFolder().getAbsolutePath();
		File dir = new File(path + File.separator + "lang");
		if(!dir.exists()) dir.mkdirs();
		return dir;
	}	
}
