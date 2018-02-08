package fr.whynot.core;

import org.bukkit.plugin.java.JavaPlugin;

import fr.whynot.core.manager.CommandsManager;
import fr.whynot.core.manager.EventsManager;

public class Core extends JavaPlugin {
	
	public void onEnable() {
		System.out.println("Plugin Allumé");
		new EventsManager().registers(this);
		new CommandsManager().registers(this);
	}
	public void onDisbale() {
		System.out.println("Plugin Eteint");
		
	}

}
