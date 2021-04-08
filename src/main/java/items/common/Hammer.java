package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Hammer extends CommonItem {

	public Hammer() {
		name = "Hammer";
		price = new Price(1, CurrencyUnits.GOLD);
		weight = new Weight(3, WeightUnits.POUND);
	}

}
