package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class SpikesIron extends CommonItem {

	public SpikesIron() {
		name = "Spikes (Iron)";
		price = new Currency(1, CurrencyTypes.GOLD);
		weight = new Measure(5, MeasureUnits.POUND);
		quantity = new Measure(10, MeasureUnits.PIECE);
	}

}
