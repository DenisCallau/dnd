package items.clothes;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Costume extends Cloth {

	public Costume() {
		name = "Costume";
		price = new Currency(5, CurrencyTypes.GOLD);
		weight = new Measure(4, MeasureUnits.POUND);
	}

}
