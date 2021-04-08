package helpers;

import constants.WeightUnits;

public class Weight extends Measure {

    private WeightUnits unit;

    public Weight(double qty, WeightUnits unit) {
        this.qty = qty;
        this.unit = unit;
    }

}
