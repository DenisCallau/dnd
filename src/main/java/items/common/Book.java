package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Book extends CommonItem {

	public Book() {
		name = "Book";
		price = new Currency(25, CurrencyTypes.GOLD);
		weight = new Measure(5, MeasureUnits.POUND);
	}

}
