package net.blizmc.rpg.utils.classes;

import org.bukkit.entity.Player;

import net.blizmc.rpg.BlizRPG;
import net.blizmc.rpg.gui.ClassSelector;
import net.blizmc.rpg.utils.UserFiles;
import net.md_5.bungee.api.ChatColor;

public class ClassManager {
	private static ClassManager instance = new ClassManager();

	public static ClassManager getInstance() {
		return instance;
	}
	
	public void onEnable() {
		Classes.VAMPIRE.setAbout(BlizRPG.getInstance().getConfig().getString("vampire_about"));
		Classes.VAMPIRE_HUNTER.setAbout(BlizRPG.getInstance().getConfig().getString("vampire_hunter_about"));
		Classes.KNIGHT.setAbout(BlizRPG.getInstance().getConfig().getString("knight_about"));
		Classes.ORC.setAbout(BlizRPG.getInstance().getConfig().getString("orc_about"));
		Classes.ELF.setAbout(BlizRPG.getInstance().getConfig().getString("elf_about"));
	}
	
	public boolean has_class(Player p) {
		if(UserFiles.getInstance().getUsers().contains("users."+p.getUniqueId()+".class")) {
			return true;
		}
		return false;
	}
	
	public void set_class(Player p, Classes c) {
		UserFiles.getInstance().getUsers().set("users."+p.getUniqueId()+".class", c.getName());
		UserFiles.getInstance().saveUsers();
	}
	
	public String get_class_name(Player p) {
		return UserFiles.getInstance().getUsers().get("users."+p.getUniqueId()+".class").toString();
	}
	
	public void open_class_menu(Player p) {
		ClassSelector.getInstance().class_window(p);
	}
	
	public void set_player_prefix(Player p, String c) {
		if(c.equals(Classes.VAMPIRE.getName())) {
			p.setDisplayName(ChatColor.RED+Classes.VAMPIRE.getName()+" "+ChatColor.GRAY+p.getName());
		}
		if(c.equals(Classes.VAMPIRE_HUNTER.getName())) {
			p.setDisplayName(ChatColor.DARK_RED+Classes.VAMPIRE_HUNTER.getName()+" "+ChatColor.GRAY+p.getName());
		}
		if(c.equals(Classes.KNIGHT.getName())) {
			p.setDisplayName(ChatColor.DARK_GRAY+Classes.KNIGHT.getName()+" "+ChatColor.GRAY+p.getName());
		}
		if(c.equals(Classes.ORC.getName())) {
			p.setDisplayName(ChatColor.GREEN+Classes.ORC.getName()+" "+ChatColor.GRAY+p.getName());
		}
		if(c.equals(Classes.ELF.getName())) {
			p.setDisplayName(ChatColor.LIGHT_PURPLE+Classes.ELF.getName()+" "+ChatColor.GRAY+p.getName());
		}
	}
}
