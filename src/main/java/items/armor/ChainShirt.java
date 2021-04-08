package items.armor;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.ArmorCategory;

public class ChainShirt extends Armor {
	
	public ChainShirt() {
		name = "Chain Shirt";
		weight = new Weight(20, WeightUnits.POUND);
		price = new Price(50, CurrencyUnits.GOLD);
		category = ArmorCategory.MEDIUM_ARMOR;
		armorClass = 13; //Add Dex modifier (max 2)
		stealthDisadvantage = false;
	}

}
