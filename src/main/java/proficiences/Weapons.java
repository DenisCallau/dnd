package proficiences;

public enum Weapons {
	
	CLUB("Club", WeaponCategory.SIMPLE_MELEE_WEAPON),
	DAGGER("Dagger", WeaponCategory.SIMPLE_MELEE_WEAPON),
	GREATCLUB("Greatclub", WeaponCategory.SIMPLE_MELEE_WEAPON),
	HANDAXE("Handaxe", WeaponCategory.SIMPLE_MELEE_WEAPON),
	JAVELIN("Javelin", WeaponCategory.SIMPLE_MELEE_WEAPON),
	LIGHT_HAMMER("Light Hammer", WeaponCategory.SIMPLE_MELEE_WEAPON),
	MACE("Mace", WeaponCategory.SIMPLE_MELEE_WEAPON),
	QUARTERSTAFF("Quarterstaff", WeaponCategory.SIMPLE_MELEE_WEAPON),
	SICKLE("Sickle", WeaponCategory.SIMPLE_MELEE_WEAPON),
	SPEAR("Spear", WeaponCategory.SIMPLE_MELEE_WEAPON),
	CROSSBOW_LIGHT("Crossbow (Light)", WeaponCategory.SIMPLE_RANGED_WEAPON),
	DART("Dart", WeaponCategory.SIMPLE_RANGED_WEAPON),
	SHORTBOW("Shortbow", WeaponCategory.SIMPLE_RANGED_WEAPON),
	SLING("Sling", WeaponCategory.SIMPLE_RANGED_WEAPON),
	BATTLEAXE("Battleaxe", WeaponCategory.MARTIAL_MELEE_WEAPON),
	FLAIL("Flail", WeaponCategory.MARTIAL_MELEE_WEAPON),
	GLAIVE("Glaive", WeaponCategory.MARTIAL_MELEE_WEAPON),
	GREATAXE("Greataxe", WeaponCategory.MARTIAL_MELEE_WEAPON),
	GREATSWORD("Greatsword", WeaponCategory.MARTIAL_MELEE_WEAPON),
	HALBERD("Halberd", WeaponCategory.MARTIAL_MELEE_WEAPON),
	LANCE("Lance", WeaponCategory.MARTIAL_MELEE_WEAPON),
	LONGSWORD("Longsword", WeaponCategory.MARTIAL_MELEE_WEAPON),
	MAUL("Maul", WeaponCategory.MARTIAL_MELEE_WEAPON),
	MORNINGSTAR("Morningstar", WeaponCategory.MARTIAL_MELEE_WEAPON),
	PIKE("Pike", WeaponCategory.MARTIAL_MELEE_WEAPON),
	RAPIER("Rapier", WeaponCategory.MARTIAL_MELEE_WEAPON),
	SCIMITAR("Scimitar", WeaponCategory.MARTIAL_MELEE_WEAPON),
	SHORTSWORD("Shortsword", WeaponCategory.MARTIAL_MELEE_WEAPON),
	TRIDENT("Trident", WeaponCategory.MARTIAL_MELEE_WEAPON),
	WAR_PICK("War Pick", WeaponCategory.MARTIAL_MELEE_WEAPON),
	WARHAMMER("Warhammer", WeaponCategory.MARTIAL_MELEE_WEAPON),
	WHIP("Whip", WeaponCategory.MARTIAL_MELEE_WEAPON),
	BLOWGUN("Blowgun", WeaponCategory.MARTIAL_RANGED_WEAPON),
	CROSSBOW_HAND("Crossbow (Hand)", WeaponCategory.MARTIAL_RANGED_WEAPON),
	CROSSBOW_HEAVY("Crossbow (Heavy)", WeaponCategory.MARTIAL_RANGED_WEAPON),
	LONGBOW("Longbow", WeaponCategory.MARTIAL_RANGED_WEAPON),
	NET("Net", WeaponCategory.MARTIAL_RANGED_WEAPON),
	ARROWS("Arrows", WeaponCategory.AMMUNITION),
	BLOWGUN_NEEDLES("Blowgun Needles", WeaponCategory.AMMUNITION),
	CROSSBOW_BOLTS("Crossbow Bolts", WeaponCategory.AMMUNITION),
	SLING_BULLETS("Sling Bullets", WeaponCategory.AMMUNITION);

	
	Weapons(String name, WeaponCategory category) {
		
	}
	
}
