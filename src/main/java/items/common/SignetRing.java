package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class SignetRing extends CommonItem {

	public SignetRing() {
		name = "Signet Ring";
		price = new Currency(5, CurrencyTypes.GOLD);
		weight = new Measure(0, MeasureUnits.NULL);
	}

}
