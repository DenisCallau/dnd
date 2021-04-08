package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class MinersPick extends CommonItem {

	public MinersPick() {
		name = "Miners Pick";
		price = new Price(2, CurrencyUnits.GOLD);
		weight = new Weight(10, WeightUnits.POUND);
	}

}
