package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class PotIron extends CommonItem {

	public PotIron() {
		name = "Pot (Iron)";
		price = new Price(2, CurrencyUnits.GOLD);
		weight = new Weight(10, WeightUnits.POUND);
	}

}
