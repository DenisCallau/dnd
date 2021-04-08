package items.weapon;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Rod extends Weapon {

	public Rod() {
		name = "Rod";
		weight = new Weight(2, WeightUnits.POUND);
		price = new Price(10, CurrencyUnits.GOLD);
		category = WeaponCategory.ARCANE_FOCUS;
	}
	
}
