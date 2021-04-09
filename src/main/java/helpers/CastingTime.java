package helpers;

import constants.TimeUnits;

public class CastingTime extends Measure {

    private double qty2;
    private TimeUnits unit;
    private TimeUnits unit2;
    private String condition;

    public CastingTime(double qty, TimeUnits unit) {
        this.qty = qty;
        this.unit = unit;
    }

    public CastingTime(double qty, TimeUnits unit, double qty2, TimeUnits unit2) {
        this.qty = qty;
        this.unit = unit;
        this.qty2 = qty2;
        this.unit2 = unit2;
    }

    public CastingTime(double qty, TimeUnits unit, String condition) {
        this.qty = qty;
        this.unit = unit;
        this.condition = condition;
    }
}
