package items.kit;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class PoisonersKit extends Kit {

	public PoisonersKit() {
		name = "Poisoner's Kit";
		price = new Price(50, CurrencyUnits.GOLD);
		weight = new Weight(2, WeightUnits.POUND);
		description = "A poisoner’s kit includes the vials, chemicals, and other Equipment necessary for the Creation of Poisons. Proficiency with this kit lets you add your Proficiency Bonus to any Ability Checks you make to craft or use Poisons.";
	}

}
