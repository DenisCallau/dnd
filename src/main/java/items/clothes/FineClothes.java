package items.clothes;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class FineClothes extends Cloth {

	public FineClothes() {
		name = "Fine Clothes";
		price = new Currency(15, CurrencyTypes.GOLD);
		weight = new Measure(6, MeasureUnits.POUND);
	}

}
