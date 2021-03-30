package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Perfume extends CommonItem {

	public Perfume() {
		name = "Perfume";
		price = new Currency(5, CurrencyTypes.GOLD);
		weight = new Measure(0, MeasureUnits.NULL);
		quantity = new Measure(1, MeasureUnits.VIAL);
	}

}
