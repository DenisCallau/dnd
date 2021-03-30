package items.container;

import constants.CurrencyTypes;
import constants.MeasureUnits;
import helpers.Currency;
import helpers.Measure;
import items.container.Container;

public class Barrel extends Container {
	
	public Barrel() {
		name = "Barrel";
		weight = new Measure(70, MeasureUnits.POUND);
		price = new Currency(2, CurrencyTypes.GOLD);
		capacity = new Measure(40, MeasureUnits.GALLON);
	}

}
