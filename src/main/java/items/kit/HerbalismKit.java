package items.kit;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class HerbalismKit extends Kit {

	public HerbalismKit() {
		name = "Herbalism Kit";
		price = new Currency(5, CurrencyTypes.GOLD);
		weight = new Measure(3, MeasureUnits.POUND);
		description = "This kit contains a variety of instruments such as clippers, mortar and pestle, and pouches and vials used by herbalists to create remedies and Potions. Proficiency with this kit lets you add your Proficiency Bonus to any Ability Checks you make to Identify or apply herbs. Also, proficiency with this kit is required to create Antitoxin and Potions of Healing.";
	}

}
