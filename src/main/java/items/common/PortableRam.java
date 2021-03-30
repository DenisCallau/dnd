package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class PortableRam extends CommonItem {

	public PortableRam() {
		name = "Portable Ram";
		price = new Currency(4, CurrencyTypes.GOLD);
		weight = new Measure(35, MeasureUnits.POUND);
	}

}
