package items.clothes;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class TravelersClothes extends Cloth {

	public TravelersClothes() {
		name = "Traveler's Clothes";
		price = new Price(2, CurrencyUnits.GOLD);
		weight = new Weight(4, WeightUnits.POUND);
	}

}
