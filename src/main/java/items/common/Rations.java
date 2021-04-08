package items.common;

import constants.CurrencyUnits;
import constants.TimeUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Time;
import helpers.Weight;

public class Rations extends CommonItem {

	public Rations() {
		name = "Rations";
		price = new Price(5, CurrencyUnits.SILVER);
		weight = new Weight(2, WeightUnits.POUND);
		quantity = new Time(1, TimeUnits.DAY);
	}

}
