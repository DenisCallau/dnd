package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class BlockAndTackle extends CommonItem {

	public BlockAndTackle() {
		name = "Block and Tackle";
		price = new Price(1, CurrencyUnits.GOLD);
		weight = new Weight(5, WeightUnits.POUND);
	}

}
