package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class FishingTackle extends CommonItem {

	public FishingTackle() {
		name = "Fishing Tackle";
		price = new Currency(1, CurrencyTypes.GOLD);
		weight = new Measure(4, MeasureUnits.POUND);
	}

}
