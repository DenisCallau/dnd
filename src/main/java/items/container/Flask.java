package items.container;

import constants.CurrencyUnits;
import constants.DistanceUnits;
import constants.VolumeUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Volume;
import helpers.Weight;

public class Flask extends Container {
	
	public Flask() {
		name = "Flask";
		price = new Price(1, CurrencyUnits.GOLD);
		weight = new Weight(1, WeightUnits.POUND);
		capacity = new Volume(1, VolumeUnits.PINT);
	}

}
