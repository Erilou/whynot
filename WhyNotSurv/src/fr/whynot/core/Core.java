package fr.whynot.core;

import org.bukkit.plugin.java.JavaPlugin;

import fr.whynot.core.database.SQL;
import fr.whynot.core.manager.CommandsManager;
import fr.whynot.core.manager.EventsManager;
import fr.whynot.core.rank.Rank;

public class Core extends JavaPlugin {
	
	public SQL sql;
	public Rank rank;
	private static Core instance;
	
	public static Core getInstance() {
		return instance;
	}
	public void onEnable() {
		System.out.println("Plugin Allum�");
		sql.connect("62.210.119.133:25580", "WhyNotSurvive", 3306, "Whynot", "4cZWSYUUocAfKO5x");
		new EventsManager().registers(this);
		new CommandsManager().registers(this);
	}
	public void onDisbale() {
		System.out.println("Plugin Eteint");
		
	}

}
