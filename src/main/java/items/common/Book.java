package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class Book extends CommonItem {

	public Book() {
		name = "Book";
		price = new Price(25, CurrencyUnits.GOLD);
		weight = new Weight(5, WeightUnits.POUND);
	}

}
