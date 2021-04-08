package items.armor;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.ArmorCategory;

public class Shield extends Armor {
	
	public Shield() {
		name = "Shield";
		weight = new Weight(6, WeightUnits.POUND);
		price = new Price(10, CurrencyUnits.GOLD);
		category = ArmorCategory.SHIELDS;
		armorClass = 2;
		stealthDisadvantage = false;
	}

}
