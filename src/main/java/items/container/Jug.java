package items.container;

import constants.CurrencyTypes;
import constants.MeasureUnits;
import helpers.Currency;
import helpers.Measure;
import items.container.Container;

public class Jug extends Container {
	
	public Jug() {
		name = "Jug";
		weight = new Measure(4, MeasureUnits.POUND);
		price = new Currency(0.02, CurrencyTypes.COPPER);
		capacity = new Measure(1, MeasureUnits.GALLON);
	}

}
