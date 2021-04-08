package items.kit;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class DisguiseKit extends Kit {

	public DisguiseKit() {
		name = "Disguise Kit";
		price = new Price(25, CurrencyUnits.GOLD);
		weight = new Weight(3, WeightUnits.POUND);
		description = "This pouch of cosmetics, hair dye, and small props lets you create disguises that change your physical Appearance. Proficiency with this kit lets you add your Proficiency Bonus to any Ability Checks you make to create a visual disguise.";
	}

}
