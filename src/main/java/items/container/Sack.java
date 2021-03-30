package items.container;

import constants.CurrencyTypes;
import constants.MeasureUnits;
import helpers.Currency;
import helpers.Measure;

public class Sack extends Container {

    public Sack() {
        name = "Sack";
        weight = new Measure(0.5, MeasureUnits.POUND);
        price = new Currency(1, CurrencyTypes.COPPER);
        capacity = new Measure(30, MeasureUnits.POUND);
    }

}
