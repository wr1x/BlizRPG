package net.blizmc.rpg.utils.classes;

public enum Classes {

	VAMPIRE("Vampire",""), //Try to capture the city and are scared of orcs
	VAMPIRE_HUNTER("Vampire Hunter",""), //Try to kill all vampires
	KNIGHT("Knight",""), //Try to protect the city from vampires and orc's
	ORC("Orc",""), //Dosnt like vampires or humans. Like to eat elf's
	ELF("Elf",""); // Tryes to protect there kingdom from orcs and elimnate the orc kingdom. 
	
	private String name;
	private String about;
	
	private Classes(String name, String about) {
		this.name = name;
		this.about = about;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
}
