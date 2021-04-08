package items.ammunition;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class BlowgunNeedles extends Ammunition {
	
	public BlowgunNeedles() {
		name = "Blowgun Needles";
		weight = new Weight(1, WeightUnits.POUND);
		price = new Price(1, CurrencyUnits.GOLD);
		quantity = 50;
	}

}
