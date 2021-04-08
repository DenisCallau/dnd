package items.usable;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Antitoxin extends UsableItem {

	public Antitoxin() {
		name = "Antitoxin (vial)";
		price = new Price(50, CurrencyUnits.GOLD);
		weight = new Weight(0, WeightUnits.POUND);
		description = "A creature that drinks this vial of liquid gains advantage on Saving Throws against poison for 1 hour. It confers no benefit to Undead or Constructs.";
	}

}
