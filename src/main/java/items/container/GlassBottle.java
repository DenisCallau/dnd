package items.container;

import constants.CurrencyUnits;
import constants.DistanceUnits;
import constants.VolumeUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Volume;
import helpers.Weight;

public class GlassBottle extends Container {
	
	public GlassBottle() {
		name = "Glass Bottle";
		price = new Price(25, CurrencyUnits.GOLD);
		weight = new Weight(2, WeightUnits.POUND);
		capacity = new Volume(1.5, VolumeUnits.PINT);
	}

}
