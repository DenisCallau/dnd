package items.container;

import constants.CurrencyTypes;
import constants.MeasureUnits;
import helpers.Currency;
import helpers.Measure;
import items.container.Container;

public class Backpack extends Container {
	
	public Backpack() {
		name = "Backpack";
		weight = new Measure(5, MeasureUnits.POUND);
		price = new Currency(2, CurrencyTypes.GOLD);
		capacity = new Measure(30, MeasureUnits.POUND);
	}

}
