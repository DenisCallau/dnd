package items.container;

import constants.CurrencyUnits;
import constants.DistanceUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class Sack extends Container {

    public Sack() {
        name = "Sack";
        price = new Price(1, CurrencyUnits.COPPER);
        weight = new Weight(0.5, WeightUnits.POUND);
        capacity = new Weight(30, WeightUnits.POUND);
    }

}
