package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class LanternBullseye extends CommonItem {

	public LanternBullseye() {
		name = "Lantern Bullseye";
		price = new Price(10, CurrencyUnits.GOLD);
		weight = new Weight(2, WeightUnits.POUND);
	}

}
