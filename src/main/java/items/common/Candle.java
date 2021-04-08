package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class Candle extends CommonItem {

	public Candle() {
		name = "Candle";
		price = new Price(1, CurrencyUnits.COPPER);
		weight = new Weight(0, WeightUnits.POUND);
	}

}
