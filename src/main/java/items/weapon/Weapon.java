package items.weapon;

import java.util.ArrayList;
import java.util.HashMap;

import constants.DamageTypes;
import constants.Dices;
import helpers.Range;
import items.Item;
import proficiences.WeaponCategory;

public abstract class Weapon extends Item {
	
	protected WeaponCategory category;
	protected Dices damage;
	protected Range range;
	protected DamageTypes damageType;
	protected ArrayList<WeaponProperties> properties = new ArrayList<>();
	protected Dices versatileDice;
	
	public int attack() {
		return damage.roll();
	}

}
