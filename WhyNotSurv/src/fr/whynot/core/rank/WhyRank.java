package fr.whynot.core.rank;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.ChatColor;

public enum WhyRank {
	
	VISITEUR("Visiteur", "§7[Visiteur] ", "§7[Visiteur]", ChatColor.GRAY),
	CITOYEN("Citoyen", "§2[Citoyen] ", "§2[Citoyen]", ChatColor.DARK_GREEN),
	CHEVALIER("Chevalier", "§a[Chevalier] ", "§6[§aChevalier§6]", ChatColor.GREEN),
	NOBLE("Noble", "§b[Noble] ", "§6[§bNoble§6]", ChatColor.AQUA),
	SEIGNEUR("Seigneur", "§c[Seigneur] ", "§6[§cSeigneur§6]", ChatColor.RED),
	VETERAN("Veteran", "§6[Veteran] ", "§6[Veteran]", ChatColor.GOLD),
	VIP("Vip", "§b[Vip] ", "§6[§bVip§6]",ChatColor.AQUA),
	ANIMATEUR("Animateur", "§5[Animateur] ", "§6[§5Animateur§6]", ChatColor.DARK_PURPLE),
	ARCHITECTE("Architecte", "§6[Architecte] ", "§6[Architecte]", ChatColor.GOLD),
	STAFF("Staff", "§9[Staff] ", "§7[§9Staff§7]",ChatColor.BLUE),
	TECHNICIEN("Techinicen", "§6[§4Tech§6] ", "§6[§4Technicien§6]", ChatColor.DARK_RED),
	CO_FONDA("CoFonda", "§c[Co-Fonda] ", "§6[§cCo-Fondateur§6]", ChatColor.RED),
	FONDATEUR("Fondateur", "§4[Fondateur] ", "§6[§4Fondateur§6]", ChatColor.DARK_RED),
	FONDATRICE("Fondatrice", "§4[Fondatrice] ", "§6[§4Fondatrice§6]", ChatColor.DARK_RED);
	
	private String name;
	private String prefix;
	private String prefixchat;
	private ChatColor color;
	
	private static Map<String, WhyRank> fromName = new HashMap<>();
	
	private WhyRank(String name, String prefix , String prefixchat, ChatColor color) {
		this.color = color;
		this.prefix = prefix;
		this.prefixchat = prefixchat;
		this.name = name;
	}
	
	static {
		for(WhyRank rank : values()) {
			fromName.put(rank.name, rank);
		}
	}
	public static WhyRank getFromName(String name) {
		for(String names : fromName.keySet()) {
			if(names.equalsIgnoreCase(names)) {
				return fromName.get(names);
			}
		}
		return null;
	}
	public String getName() {
		return name;
	}
	public String getPrefix() {
		return prefix;
	}
	public String getPrefixchat() {
		return prefixchat;
	}
	public ChatColor getColor() {
		return color;
	}

}
