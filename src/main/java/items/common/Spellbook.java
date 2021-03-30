package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Spellbook extends CommonItem {

	public Spellbook() {
		name = "Spellbook";
		price = new Currency(50, CurrencyTypes.GOLD);
		weight = new Measure(3, MeasureUnits.POUND);
	}

}
