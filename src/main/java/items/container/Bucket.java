package items.container;

import constants.CurrencyTypes;
import constants.MeasureUnits;
import helpers.Currency;
import helpers.Measure;
import items.container.Container;

public class Bucket extends Container {
	
	public Bucket() {
		name = "Bucket";
		weight = new Measure(2, MeasureUnits.POUND);
		price = new Currency(5, CurrencyTypes.COPPER);
		capacity = new Measure(3, MeasureUnits.GALLON);
	}

}
