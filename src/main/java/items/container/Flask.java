package items.container;

import constants.CurrencyTypes;
import constants.MeasureUnits;
import helpers.Currency;
import helpers.Measure;
import items.container.Container;

public class Flask extends Container {
	
	public Flask() {
		name = "Flask";
		weight = new Measure(1, MeasureUnits.POUND);
		price = new Currency(1, CurrencyTypes.GOLD);
		capacity = new Measure(1, MeasureUnits.PINT);
	}

}
