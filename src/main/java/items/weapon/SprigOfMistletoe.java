package items.weapon;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class SprigOfMistletoe extends Weapon {

	public SprigOfMistletoe() {
		name = "Sprig of Mistletoe";
		weight = new Weight(0, WeightUnits.POUND);
		price = new Price(1, CurrencyUnits.GOLD);
		category = WeaponCategory.DRUIDIC_FOCUS;
	}
	
}
