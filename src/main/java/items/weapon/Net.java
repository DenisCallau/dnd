package items.weapon;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Range;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Net extends Weapon {
	
	public Net() {
		name = "Net";
		weight = new Weight(3, WeightUnits.POUND);
		price = new Price(1, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_RANGED_WEAPON;
		properties.add(WeaponProperties.SPECIAL);
		properties.add(WeaponProperties.THROWN);
		range = new Range(5, 15);
	}

}
