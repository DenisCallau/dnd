package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class Blanket extends CommonItem {

	public Blanket() {
		name = "Blanket";
		price = new Price(5, CurrencyUnits.SILVER);
		weight = new Weight(5, WeightUnits.POUND);
	}

}
