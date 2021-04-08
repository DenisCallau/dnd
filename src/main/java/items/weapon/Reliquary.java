package items.weapon;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Reliquary extends Weapon {
	
	public Reliquary() {
		name = "Reliquary";
		weight = new Weight(2, WeightUnits.POUND);
		price = new Price(5, CurrencyUnits.GOLD);
		category = WeaponCategory.HOLY_SYMBOL;
	}

}
