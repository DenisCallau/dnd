package helpers;

import constants.VolumeUnits;

public class Volume extends Measure {

    private VolumeUnits unit;

    public Volume(double qty, VolumeUnits unit) {
        this.qty = qty;
        this.unit = unit;
    }
}
