package items.container;

import constants.CurrencyUnits;
import constants.DistanceUnits;
import constants.VolumeUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Volume;
import helpers.Weight;

public class Barrel extends Container {
	
	public Barrel() {
		name = "Barrel";
		price = new Price(2, CurrencyUnits.GOLD);
		weight = new Weight(70, WeightUnits.POUND);
		capacity = new Volume(40, VolumeUnits.GALLON);
	}

}
