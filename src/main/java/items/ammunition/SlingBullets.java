package items.ammunition;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class SlingBullets extends Ammunition {
	
	public SlingBullets() {
		name = "Sling Bullets";
		weight = new Weight(1.5, WeightUnits.POUND);
		price = new Price(4, CurrencyUnits.COPPER);
		quantity = 20;
	}

}
