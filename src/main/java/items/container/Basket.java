package items.container;

import constants.CurrencyTypes;
import constants.MeasureUnits;
import helpers.Currency;
import helpers.Measure;
import items.container.Container;

public class Basket extends Container {
	
	public Basket() {
		name = "Basket";
		weight = new Measure(2, MeasureUnits.POUND);
		price = new Currency(4, CurrencyTypes.SILVER);
		capacity = new Measure(40, MeasureUnits.POUND);
	}

}
