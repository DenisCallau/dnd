package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class ScaleMerchants extends CommonItem {

	public ScaleMerchants() {
		name = "Scale (Merchants)";
		price = new Price(5, CurrencyUnits.GOLD);
		weight = new Weight(3, WeightUnits.POUND);
	}

}
