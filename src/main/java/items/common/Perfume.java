package items.common;

import constants.CurrencyUnits;
import constants.VolumeUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Volume;
import helpers.Weight;

public class Perfume extends CommonItem {

	public Perfume() {
		name = "Perfume";
		price = new Price(5, CurrencyUnits.GOLD);
		weight = new Weight(0, WeightUnits.POUND);
		quantity = new Volume(1, VolumeUnits.VIAL);
	}

}
