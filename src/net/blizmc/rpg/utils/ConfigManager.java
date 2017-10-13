package net.blizmc.rpg.utils;

import net.blizmc.rpg.BlizRPG;

public class ConfigManager {
	
	private static ConfigManager instance = new ConfigManager();

	public static ConfigManager getInstance() {
		return instance;
	}

	private BlizRPG pl = BlizRPG.getInstance();
	
	public void settings() {
		//ChatFormat Config
		pl.getConfig().addDefault("chatformat_preifx", "Bliz");
		pl.getConfig().addDefault("chatformat_quest", "Quest");
		
		//Classes Config
		pl.getConfig().addDefault("vampire_about", "something about a vampire");
		pl.getConfig().addDefault("vampire_hunter_about", "something about a vampire hunter");
		pl.getConfig().addDefault("knight_about", "something about a knight");
		pl.getConfig().addDefault("orc_about", "something about a orc");
		pl.getConfig().addDefault("elf_about", "something about a elf");
	}
}
