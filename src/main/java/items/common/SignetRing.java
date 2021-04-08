package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class SignetRing extends CommonItem {

	public SignetRing() {
		name = "Signet Ring";
		price = new Price(5, CurrencyUnits.GOLD);
		weight = new Weight(0, WeightUnits.POUND);
	}

}
