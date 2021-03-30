package items.kit;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class MessKit extends Kit {

	public MessKit() {
		name = "Mess Kit";
		price = new Currency(2, CurrencyTypes.SILVER);
		weight = new Measure(1, MeasureUnits.POUND);
		description = "This tin box contains a cup and simple cutlery. The box clamps together, and one side can be used as a cooking pan and the other as a plate or shallow bowl.";
	}

}
