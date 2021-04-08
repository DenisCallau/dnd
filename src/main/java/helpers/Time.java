package helpers;

import constants.TimeUnits;

public class Time extends Measure {

    private TimeUnits unit;

    public Time(double qty, TimeUnits unit) {
        this.qty = qty;
        this.unit = unit;
    }

}
