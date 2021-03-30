package items.clothes;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class CommonClothes extends Cloth {

	public CommonClothes() {
		name = "Common Clothes";
		price = new Currency(5, CurrencyTypes.SILVER);
		weight = new Measure(3, MeasureUnits.POUND);
	}

}
