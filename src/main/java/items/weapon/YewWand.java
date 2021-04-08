package items.weapon;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class YewWand extends Weapon {
	
	public YewWand() {
		name = "Yew Wand";
		weight = new Weight(1, WeightUnits.POUND);
		price = new Price(10, CurrencyUnits.GOLD);
		category = WeaponCategory.DRUIDIC_FOCUS;
	}

}
