package items.container;

import constants.CurrencyUnits;
import constants.DistanceUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Volume;
import helpers.Weight;

public class Vial extends Container {

    public Vial() {
        name = "Vial";
        price = new Price(1, CurrencyUnits.COPPER);
        weight = new Weight(0, WeightUnits.POUND);
        capacity = new Weight(4, WeightUnits.OUNCE);
    }

}
