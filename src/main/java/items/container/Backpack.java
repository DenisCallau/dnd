package items.container;

import constants.CurrencyUnits;
import constants.DistanceUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class Backpack extends Container {
	
	public Backpack() {
		name = "Backpack";
		price = new Price(2, CurrencyUnits.GOLD);
		weight = new Weight(5, WeightUnits.POUND);
		capacity = new Weight(30, WeightUnits.POUND);
	}

}
