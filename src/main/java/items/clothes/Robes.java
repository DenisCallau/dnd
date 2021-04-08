package items.clothes;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class Robes extends Cloth {

	public Robes() {
		name = "Robes";
		price = new Price(1, CurrencyUnits.GOLD);
		weight = new Weight(4, WeightUnits.POUND);
	}

}
