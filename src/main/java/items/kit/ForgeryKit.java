package items.kit;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class ForgeryKit extends Kit {

	public ForgeryKit() {
		name = "Forgery Kit";
		price = new Currency(15, CurrencyTypes.GOLD);
		weight = new Measure(5, MeasureUnits.POUND);
		description = "This small box contains a variety of papers and parchments, pens and inks, seals and Sealing wax, gold and silver leaf, and other supplies necessary to create convincing forgeries of physical documents. Proficiency with this kit lets you add your Proficiency Bonus to any Ability Checks you make to create a physical forgery of a document.";
	}

}
