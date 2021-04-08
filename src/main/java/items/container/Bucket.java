package items.container;

import constants.CurrencyUnits;
import constants.DistanceUnits;
import constants.VolumeUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Volume;
import helpers.Weight;

public class Bucket extends Container {
	
	public Bucket() {
		name = "Bucket";
		price = new Price(5, CurrencyUnits.COPPER);
		weight = new Weight(2, WeightUnits.POUND);
		capacity = new Volume(3, VolumeUnits.GALLON);
	}

}
