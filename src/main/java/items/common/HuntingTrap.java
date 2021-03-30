package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class HuntingTrap extends CommonItem {

	public HuntingTrap() {
		name = "Hunting Trap";
		price = new Currency(5, CurrencyTypes.GOLD);
		weight = new Measure(25, MeasureUnits.POUND);
	}

}
