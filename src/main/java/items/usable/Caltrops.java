package items.usable;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Caltrops extends UsableItem {

	public Caltrops() {
		name = "Caltrops (bag of 20)";
		price = new Currency(1, CurrencyTypes.GOLD);
		weight = new Measure(2, MeasureUnits.POUND);
		description = "As an action, you can spread a single bag of caltrops to cover a 5-foot-square area. Any creature that enters the area must succeed on a DC 15 Dexterity saving throw or stop moving and take 1 piercing damage. Until the creature regains at least 1 hit point, its walking speed is reduced by 10 feet. A creature moving through the area at half speed doesn't need to make the saving throw.";
	}

}
