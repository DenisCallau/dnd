package items.container;

import constants.CurrencyTypes;
import constants.MeasureUnits;
import helpers.Currency;
import helpers.Measure;

public class Vial extends Container {

    public Vial() {
        name = "Vial";
        weight = new Measure(0, MeasureUnits.NULL);
        price = new Currency(1, CurrencyTypes.COPPER);
        capacity = new Measure(4, MeasureUnits.OUNCE);
    }

}
