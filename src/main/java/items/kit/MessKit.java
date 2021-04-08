package items.kit;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class MessKit extends Kit {

	public MessKit() {
		name = "Mess Kit";
		price = new Price(2, CurrencyUnits.SILVER);
		weight = new Weight(1, WeightUnits.POUND);
		description = "This tin box contains a cup and simple cutlery. The box clamps together, and one side can be used as a cooking pan and the other as a plate or shallow bowl.";
	}

}
