package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class SignalWhistle extends CommonItem {

	public SignalWhistle() {
		name = "Signal Whistle";
		price = new Currency(5, CurrencyTypes.COPPER);
		weight = new Measure(0, MeasureUnits.NULL);
	}

}
