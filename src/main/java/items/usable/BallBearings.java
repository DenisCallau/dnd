package items.usable;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class BallBearings extends UsableItem {

	public BallBearings() {
		name = "Ball Bearings (bag of 1)";
		price = new Price(1, CurrencyUnits.GOLD);
		weight = new Weight(2, WeightUnits.POUND);
		description = "As an action, you can spill these tiny metal balls from their pouch to cover a level, square area that is 10 feet on a side. A creature moving across the covered area must succeed on a DC 10 Dexterity saving throw or fall prone. A creature moving through the area at half speed doesn’t need to make the save.";
	}

}
