package helpers;

import constants.DistanceUnits;

public class Range {

    private Distance normalDistance;
    private Distance maxDistance;

    public Range(double normalDistance, double maxDistance) {
        this.normalDistance = new Distance(normalDistance, DistanceUnits.FEET);
        this.maxDistance = new Distance(maxDistance, DistanceUnits.FEET);
    }
}
