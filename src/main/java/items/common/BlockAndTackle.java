package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class BlockAndTackle extends CommonItem {

	public BlockAndTackle() {
		name = "Block and Tackle";
		price = new Currency(1, CurrencyTypes.GOLD);
		weight = new Measure(5, MeasureUnits.POUND);
	}

}
