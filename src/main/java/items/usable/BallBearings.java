package items.usable;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class BallBearings extends UsableItem {

	public BallBearings() {
		name = "Ball Bearings (bag of 1)";
		price = new Currency(1, CurrencyTypes.GOLD);
		weight = new Measure(2, MeasureUnits.POUND);
		description = "As an action, you can spill these tiny metal balls from their pouch to cover a level, square area that is 10 feet on a side. A creature moving across the covered area must succeed on a DC 10 Dexterity saving throw or fall prone. A creature moving through the area at half speed doesn’t need to make the save.";
	}

}
