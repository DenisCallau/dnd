package proficiences;

public enum Armor {
	
	LEATHER("Leather", ArmorCategory.LIGHT_ARMOR),
	PADDED("Padded", ArmorCategory.LIGHT_ARMOR),
	STUDDED_LEATHER("Studded Leather", ArmorCategory.LIGHT_ARMOR),
	BREASTPLATE("Breastplate", ArmorCategory.MEDIUM_ARMOR),
	CHAIN_SHIRT("Chain Shirt", ArmorCategory.MEDIUM_ARMOR),
	HALF_PLATE("Half Plate", ArmorCategory.MEDIUM_ARMOR),
	HIDE("Hide", ArmorCategory.MEDIUM_ARMOR),
	SCALE_MAIL("Scale Mail", ArmorCategory.MEDIUM_ARMOR),
	CHAIN_MAIL("Chain Mail", ArmorCategory.HEAVY_ARMOR),
	PLATE("Plate", ArmorCategory.HEAVY_ARMOR),
	RING_MAIL("Ring Mail", ArmorCategory.HEAVY_ARMOR),
	SPLINT("Splint", ArmorCategory.HEAVY_ARMOR),
	SHIELD("Shield", ArmorCategory.SHIELDS);

	Armor(String name, ArmorCategory category) {	
	}	

}
		