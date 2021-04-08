package items.kit;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class HealersKit extends Kit {

	public HealersKit() {
		name = "Healer's Kit";
		price = new Price(5, CurrencyUnits.GOLD);
		weight = new Weight(3, WeightUnits.POUND);
		description = "This kit is a leather pouch containing bandages, salves, and splints. The kit has ten uses. As an action, you can expend one use of the kit to stabilize a creature that has 0 Hit Points, without needing to make a Wisdom (Medicine) check.";
	}

}
