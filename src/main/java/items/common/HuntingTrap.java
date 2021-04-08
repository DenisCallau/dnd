package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class HuntingTrap extends CommonItem {

	public HuntingTrap() {
		name = "Hunting Trap";
		price = new Price(5, CurrencyUnits.GOLD);
		weight = new Weight(25, WeightUnits.POUND);
	}

}
