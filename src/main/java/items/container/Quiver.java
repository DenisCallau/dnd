package items.container;

import constants.CurrencyTypes;
import constants.MeasureUnits;
import helpers.Currency;
import helpers.Measure;

public class Quiver extends Container {

    public Quiver() {
        name = "Quiver";
        weight = new Measure(1, MeasureUnits.POUND);
        price = new Currency(1, CurrencyTypes.GOLD);
        capacity = new Measure(20, MeasureUnits.PIECE);
    }

}
