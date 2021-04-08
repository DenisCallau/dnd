package items.armor;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.ArmorCategory;

public class Splint extends Armor {
	
	public Splint() {
		name = "Splint";
		weight = new Weight(60, WeightUnits.POUND);
		price = new Price(200, CurrencyUnits.GOLD);
		category = ArmorCategory.HEAVY_ARMOR;
		armorClass = 17;
		strength = 15;
		stealthDisadvantage = true;
	}

}
