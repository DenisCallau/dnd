package items.usable;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Acid extends UsableItem {

	public Acid() {
		name = "Acid (vial)";
		price = new Currency(25, CurrencyTypes.GOLD);
		weight = new Measure(1, MeasureUnits.POUND);
		description = "As an action, you can splash the contents of this vial onto a creature within 5 feet of you or throw the vial up to 20 feet, shattering it on impact. In either case, make a ranged Attack against a creature or object, treating the acid as an Improvised Weapon. On a hit, the target takes 2d6 acid damage.";
	}

}
