package items.armor;

import items.Item;
import proficiences.ArmorCategory;

public abstract class Armor extends Item {
	
	protected ArmorCategory category;
	protected int armorClass;
	protected int strength;
	protected boolean stealthDisadvantage;
	
}
