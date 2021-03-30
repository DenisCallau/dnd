package items.usable;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Antitoxin extends UsableItem {

	public Antitoxin() {
		name = "Antitoxin (vial)";
		price = new Currency(50, CurrencyTypes.GOLD);
		weight = new Measure(0, MeasureUnits.POUND);
		description = "A creature that drinks this vial of liquid gains advantage on Saving Throws against poison for 1 hour. It confers no benefit to Undead or Constructs.";
	}

}
