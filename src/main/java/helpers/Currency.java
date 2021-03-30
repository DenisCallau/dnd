package helpers;

import constants.CurrencyTypes;

public class Currency {

    private double quantity;
    private CurrencyTypes type;

    public Currency(double quantity, CurrencyTypes type) {
        this.quantity = quantity;
        this.type = type;
    }
}
