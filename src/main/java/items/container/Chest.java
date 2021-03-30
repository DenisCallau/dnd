package items.container;

import constants.CurrencyTypes;
import constants.MeasureUnits;
import helpers.Currency;
import helpers.Measure;
import items.container.Container;

public class Chest extends Container {
	
	public Chest() {
		name = "Chest";
		weight = new Measure(25, MeasureUnits.POUND);
		price = new Currency(5, CurrencyTypes.GOLD);
		capacity = new Measure(300, MeasureUnits.POUND);
	}

}
