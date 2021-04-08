package items.container;

import constants.CurrencyUnits;
import constants.DistanceUnits;
import constants.VolumeUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Volume;
import helpers.Weight;

public class Waterskin extends Container {

    public Waterskin() {
        name = "Waterskin";
        price = new Price(2, CurrencyUnits.SILVER);
        weight = new Weight(5, WeightUnits.POUND);
        capacity = new Volume(4, VolumeUnits.PINT);
    }

}
