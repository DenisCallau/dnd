package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class ComponentsPouch extends CommonItem {

	public ComponentsPouch() {
		name = "Component's Pouch";
		price = new Currency(25, CurrencyTypes.GOLD);
		weight = new Measure(2, MeasureUnits.POUND);
	}

}
