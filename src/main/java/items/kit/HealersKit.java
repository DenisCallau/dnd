package items.kit;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class HealersKit extends Kit {

	public HealersKit() {
		name = "Healer's Kit";
		price = new Currency(5, CurrencyTypes.GOLD);
		weight = new Measure(3, MeasureUnits.POUND);
		description = "This kit is a leather pouch containing bandages, salves, and splints. The kit has ten uses. As an action, you can expend one use of the kit to stabilize a creature that has 0 Hit Points, without needing to make a Wisdom (Medicine) check.";
	}

}
