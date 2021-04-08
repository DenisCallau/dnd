package items.ammunition;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class Arrows extends Ammunition {
	
	public Arrows() {
		name = "Arrows";
		weight = new Weight(1, WeightUnits.POUND);
		price = new Price(1, CurrencyUnits.GOLD);
		quantity = 20;
	}

}
