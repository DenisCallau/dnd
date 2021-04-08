package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class SignalWhistle extends CommonItem {

	public SignalWhistle() {
		name = "Signal Whistle";
		price = new Price(5, CurrencyUnits.COPPER);
		weight = new Weight(0, WeightUnits.POUND);
	}

}
