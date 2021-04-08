package items.clothes;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class CommonClothes extends Cloth {

	public CommonClothes() {
		name = "Common Clothes";
		price = new Price(5, CurrencyUnits.SILVER);
		weight = new Weight(3, WeightUnits.POUND);
	}

}
