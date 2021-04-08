package items.kit;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class ForgeryKit extends Kit {

	public ForgeryKit() {
		name = "Forgery Kit";
		price = new Price(15, CurrencyUnits.GOLD);
		weight = new Weight(5, WeightUnits.POUND);
		description = "This small box contains a variety of papers and parchments, pens and inks, seals and Sealing wax, gold and silver leaf, and other supplies necessary to create convincing forgeries of physical documents. Proficiency with this kit lets you add your Proficiency Bonus to any Ability Checks you make to create a physical forgery of a document.";
	}

}
