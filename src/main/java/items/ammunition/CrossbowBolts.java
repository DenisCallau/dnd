package items.ammunition;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class CrossbowBolts extends Ammunition {
	
	public CrossbowBolts() {
		name = "Crossbow Bolts";
		weight = new Weight(1.5, WeightUnits.POUND);
		price = new Price(1, CurrencyUnits.GOLD);
		quantity = 20;
	}

}
