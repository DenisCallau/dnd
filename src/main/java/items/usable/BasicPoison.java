package items.usable;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class BasicPoison extends UsableItem {

	public BasicPoison() {
		name = "Basic Poison";
		price = new Price(100, CurrencyUnits.GOLD);
		weight = new Weight(0, WeightUnits.POUND);
		description = "You can use the poison in this vial to coat one slashing or piercing weapon or up to three pieces of Ammunition. Applying the poison takes an action. A creature hit by the Poisoned weapon or Ammunition must make a DC 10 Constitution saving throw or take 1d4 poison damage. Once applied, the poison retains potency for 1 minute before drying.";
	}

}
