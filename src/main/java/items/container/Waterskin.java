package items.container;

import constants.CurrencyTypes;
import constants.MeasureUnits;
import helpers.Currency;
import helpers.Measure;

public class Waterskin extends Container {

    public Waterskin() {
        name = "Waterskin";
        weight = new Measure(5, MeasureUnits.POUND);
        price = new Currency(2, CurrencyTypes.SILVER);
        capacity = new Measure(4, MeasureUnits.PINT);
    }

}
