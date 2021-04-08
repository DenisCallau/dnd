package items.weapon;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class WoodenStaff extends Weapon {
	
	public WoodenStaff() {
		name = "Wooden Staff";
		weight = new Weight(4, WeightUnits.POUND);
		price = new Price(5, CurrencyUnits.GOLD);
		category = WeaponCategory.DRUIDIC_FOCUS;
	}

}
