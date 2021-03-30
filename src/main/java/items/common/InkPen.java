package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class InkPen extends CommonItem {

	public InkPen() {
		name = "Ink Pen";
		price = new Currency(2, CurrencyTypes.COPPER);
		weight = new Measure(0, MeasureUnits.NULL);
	}

}
