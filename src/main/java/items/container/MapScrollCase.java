package items.container;

import constants.CurrencyTypes;
import constants.MeasureUnits;
import helpers.Currency;
import helpers.Measure;
import items.container.Container;

public class MapScrollCase extends Container {
	
	public MapScrollCase() {
		name = "Map/Scroll Case";
		weight = new Measure(1, MeasureUnits.POUND);
		price = new Currency(1, CurrencyTypes.GOLD);
		capacity = new Measure(10, MeasureUnits.PIECE);
	}

}
