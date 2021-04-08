package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class InkPen extends CommonItem {

	public InkPen() {
		name = "Ink Pen";
		price = new Price(2, CurrencyUnits.COPPER);
		weight = new Weight(0, WeightUnits.POUND);
	}

}
