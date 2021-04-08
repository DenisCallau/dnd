package items.clothes;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class FineClothes extends Cloth {

	public FineClothes() {
		name = "Fine Clothes";
		price = new Price(15, CurrencyUnits.GOLD);
		weight = new Weight(6, WeightUnits.POUND);
	}

}
