package helpers;

import constants.TimeUnits;

public class Duration extends Measure {

    private TimeUnits unit;
    private double maxTime;
    private boolean concentration;

    public Duration(TimeUnits unit) {
        this.unit = unit;
    }

    public Duration(double qty, TimeUnits unit) {
        this.qty = qty;
        this.unit = unit;
    }

    public Duration(boolean concentration, double maxTime, TimeUnits unit) {
        this.concentration = concentration;
        this.maxTime = maxTime;
        this.unit = unit;
    }

}
