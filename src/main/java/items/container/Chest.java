package items.container;

import constants.CurrencyUnits;
import constants.DistanceUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class Chest extends Container {
	
	public Chest() {
		name = "Chest";
		price = new Price(5, CurrencyUnits.GOLD);
		weight = new Weight(25, WeightUnits.POUND);
		capacity = new Weight(300, WeightUnits.POUND);
	}

}
