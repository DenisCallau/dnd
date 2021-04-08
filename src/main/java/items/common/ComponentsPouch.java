package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class ComponentsPouch extends CommonItem {

	public ComponentsPouch() {
		name = "Component's Pouch";
		price = new Price(25, CurrencyUnits.GOLD);
		weight = new Weight(2, WeightUnits.POUND);
	}

}
