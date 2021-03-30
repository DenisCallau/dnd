package items.kit;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class PoisonersKit extends Kit {

	public PoisonersKit() {
		name = "Poisoner's Kit";
		price = new Currency(50, CurrencyTypes.GOLD);
		weight = new Measure(2, MeasureUnits.POUND);
		description = "A poisoner’s kit includes the vials, chemicals, and other Equipment necessary for the Creation of Poisons. Proficiency with this kit lets you add your Proficiency Bonus to any Ability Checks you make to craft or use Poisons.";
	}

}
