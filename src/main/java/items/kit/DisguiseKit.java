package items.kit;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class DisguiseKit extends Kit {

	public DisguiseKit() {
		name = "Disguise Kit";
		price = new Currency(25, CurrencyTypes.GOLD);
		weight = new Measure(3, MeasureUnits.POUND);
		description = "This pouch of cosmetics, hair dye, and small props lets you create disguises that change your physical Appearance. Proficiency with this kit lets you add your Proficiency Bonus to any Ability Checks you make to create a visual disguise.";
	}

}
