package items.armor;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.ArmorCategory;

public class Plate extends Armor {
	
	public Plate() {
		name = "Plate";
		weight = new Weight(65, WeightUnits.POUND);
		price = new Price(1500, CurrencyUnits.GOLD);
		category = ArmorCategory.HEAVY_ARMOR;
		armorClass = 18;
		strength = 15;
		stealthDisadvantage = true;
	}

}
