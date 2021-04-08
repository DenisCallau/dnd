package items.usable;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class PotionOfHealing extends UsableItem {

	public PotionOfHealing() {
		name = "Potion of Healing";
		price = new Price(50, CurrencyUnits.GOLD);
		weight = new Weight(0.5 , WeightUnits.POUND);
		description = "You regain 2d4+2 Hit Points when you drink this potion. Whatever its potency, the potion’s red liquid glimmers when agitated.";
	}

}
