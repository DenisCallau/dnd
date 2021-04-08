package items.container;

import constants.CurrencyUnits;
import constants.DistanceUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class Pouch extends Container {

    public Pouch() {
        name = "Pouch";
        price = new Price(1, CurrencyUnits.GOLD);
        weight = new Weight(1, WeightUnits.POUND);
        capacity = new Weight(6, WeightUnits.POUND);
    }

}
