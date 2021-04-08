package items.container;

import constants.CurrencyUnits;
import constants.DistanceUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class Basket extends Container {
	
	public Basket() {
		name = "Basket";
		price = new Price(4, CurrencyUnits.SILVER);
		weight = new Weight(2, WeightUnits.POUND);
		capacity = new Weight(40, WeightUnits.POUND);
	}

}
