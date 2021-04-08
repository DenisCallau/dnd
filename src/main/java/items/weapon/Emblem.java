package items.weapon;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Emblem extends Weapon {
	
	public Emblem() {
		name = "Emblem";
		weight = new Weight(0, WeightUnits.POUND);
		price = new Price(5, CurrencyUnits.GOLD);
		category = WeaponCategory.HOLY_SYMBOL;

	}

}
