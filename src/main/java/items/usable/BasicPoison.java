package items.usable;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class BasicPoison extends UsableItem {

	public BasicPoison() {
		name = "Basic Poison";
		price = new Currency(100, CurrencyTypes.GOLD);
		weight = new Measure(0, MeasureUnits.POUND);
		description = "You can use the poison in this vial to coat one slashing or piercing weapon or up to three pieces of Ammunition. Applying the poison takes an action. A creature hit by the Poisoned weapon or Ammunition must make a DC 10 Constitution saving throw or take 1d4 poison damage. Once applied, the poison retains potency for 1 minute before drying.";
	}

}
