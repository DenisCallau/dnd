package items.clothes;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class Costume extends Cloth {

	public Costume() {
		name = "Costume";
		price = new Price(5, CurrencyUnits.GOLD);
		weight = new Weight(4, WeightUnits.POUND);
	}

}
