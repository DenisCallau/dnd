package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Crowbar extends CommonItem {

	public Crowbar() {
		name = "Crowbar";
		price = new Price(2, CurrencyUnits.GOLD);
		weight = new Weight(5, WeightUnits.POUND);
	}

}
