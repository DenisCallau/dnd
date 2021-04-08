package helpers;

import constants.DistanceUnits;

public class Distance extends Measure {

    private DistanceUnits unit;

    public Distance(double qty, DistanceUnits unit) {
        this.qty = qty;
        this.unit = unit;
    }
}
