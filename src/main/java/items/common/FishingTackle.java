package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class FishingTackle extends CommonItem {

	public FishingTackle() {
		name = "Fishing Tackle";
		price = new Price(1, CurrencyUnits.GOLD);
		weight = new Weight(4, WeightUnits.POUND);
	}

}
