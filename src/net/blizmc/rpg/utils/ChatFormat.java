package net.blizmc.rpg.utils;

import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class ChatFormat {

	private static ChatFormat instance = new ChatFormat();

	public static ChatFormat getInstance() {
		return instance;
	}
	
	public void quest_message(Player p, String msg) {
		p.sendMessage(ChatColor.GOLD+ChatColor.BOLD.toString()+"Quest "+ChatColor.YELLOW+msg);
	}
	
	public void npc_message(Player p, String npc_name, String msg) {
		p.sendMessage(ChatColor.DARK_GREEN+npc_name+": "+ChatColor.GREEN+msg);
	}
	
	public void info_message(Player p, String msg) {
		p.sendMessage(ChatColor.DARK_RED+"Info "+ChatColor.RED+msg);
	}
}
