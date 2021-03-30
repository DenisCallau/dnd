package items.usable;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class PotionOfHealing extends UsableItem {

	public PotionOfHealing() {
		name = "Potion of Healing";
		price = new Currency(50, CurrencyTypes.GOLD);
		weight = new Measure(0.5 , MeasureUnits.POUND);
		description = "You regain 2d4+2 Hit Points when you drink this potion. Whatever its potency, the potion’s red liquid glimmers when agitated.";
	}

}
