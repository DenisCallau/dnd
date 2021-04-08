package items.kit;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class HerbalismKit extends Kit {

	public HerbalismKit() {
		name = "Herbalism Kit";
		price = new Price(5, CurrencyUnits.GOLD);
		weight = new Weight(3, WeightUnits.POUND);
		description = "This kit contains a variety of instruments such as clippers, mortar and pestle, and pouches and vials used by herbalists to create remedies and Potions. Proficiency with this kit lets you add your Proficiency Bonus to any Ability Checks you make to Identify or apply herbs. Also, proficiency with this kit is required to create Antitoxin and Potions of Healing.";
	}

}
