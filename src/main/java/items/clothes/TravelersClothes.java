package items.clothes;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class TravelersClothes extends Cloth {

	public TravelersClothes() {
		name = "Traveler's Clothes";
		price = new Currency(2, CurrencyTypes.GOLD);
		weight = new Measure(4, MeasureUnits.POUND);
	}

}
