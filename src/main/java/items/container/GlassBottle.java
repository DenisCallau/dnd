package items.container;

import constants.CurrencyTypes;
import constants.MeasureUnits;
import helpers.Currency;
import helpers.Measure;
import items.container.Container;

public class GlassBottle extends Container {
	
	public GlassBottle() {
		name = "Glass Bottle";
		weight = new Measure(2, MeasureUnits.POUND);
		price = new Currency(25, CurrencyTypes.GOLD);
		capacity = new Measure(1.5, MeasureUnits.PINT);
	}

}
