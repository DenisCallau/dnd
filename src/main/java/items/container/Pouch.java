package items.container;

import constants.CurrencyTypes;
import constants.MeasureUnits;
import helpers.Currency;
import helpers.Measure;

public class Pouch extends Container {

    public Pouch() {
        name = "Pouch";
        weight = new Measure(1, MeasureUnits.POUND);
        price = new Currency(1, CurrencyTypes.GOLD);
        capacity = new Measure(6, MeasureUnits.POUND);
    }

}
