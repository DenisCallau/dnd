package items.weapon;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Amulet extends Weapon {
	
	public Amulet() {
		name = "Amulet";
		weight = new Weight(1, WeightUnits.POUND);
		price = new Price(5, CurrencyUnits.GOLD);
		category = WeaponCategory.HOLY_SYMBOL;
	}

}
