package items.clothes;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Robes extends Cloth {

	public Robes() {
		name = "Robes";
		price = new Currency(1, CurrencyTypes.GOLD);
		weight = new Measure(4, MeasureUnits.POUND);
	}

}
