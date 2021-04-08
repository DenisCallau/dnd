package items.armor;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.ArmorCategory;

public class HalfPlate extends Armor {
	
	public HalfPlate() {
		name = "Half Plate";
		weight = new Weight(40, WeightUnits.POUND);
		price = new Price(750, CurrencyUnits.GOLD);
		category = ArmorCategory.MEDIUM_ARMOR;
		armorClass = 15; //Add Dex modifier (max 2)
		stealthDisadvantage = true;
	}

}
