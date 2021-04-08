package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class PortableRam extends CommonItem {

	public PortableRam() {
		name = "Portable Ram";
		price = new Price(4, CurrencyUnits.GOLD);
		weight = new Weight(35, WeightUnits.POUND);
	}

}
