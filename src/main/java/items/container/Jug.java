package items.container;

import constants.CurrencyUnits;
import constants.DistanceUnits;
import constants.VolumeUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Volume;
import helpers.Weight;

public class Jug extends Container {
	
	public Jug() {
		name = "Jug";
		price = new Price(0.02, CurrencyUnits.COPPER);
		weight = new Weight(4, WeightUnits.POUND);
		capacity = new Volume(1, VolumeUnits.GALLON);
	}

}
