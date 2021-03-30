package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class ScaleMerchants extends CommonItem {

	public ScaleMerchants() {
		name = "Scale (Merchants)";
		price = new Currency(5, CurrencyTypes.GOLD);
		weight = new Measure(3, MeasureUnits.POUND);
	}

}
