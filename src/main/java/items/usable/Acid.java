package items.usable;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Acid extends UsableItem {

	public Acid() {
		name = "Acid (vial)";
		price = new Price(25, CurrencyUnits.GOLD);
		weight = new Weight(1, WeightUnits.POUND);
		description = "As an action, you can splash the contents of this vial onto a creature within 5 feet of you or throw the vial up to 20 feet, shattering it on impact. In either case, make a ranged Attack against a creature or object, treating the acid as an Improvised Weapon. On a hit, the target takes 2d6 acid damage.";
	}

}
