package helpers;

import constants.CurrencyUnits;

public class Price extends Measure {

    private CurrencyUnits unit;

    public Price(double qty, CurrencyUnits unit) {
        this.qty = qty;
        this.unit = unit;
    }
}
