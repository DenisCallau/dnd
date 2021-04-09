package helpers;

import constants.AreasOfEffect;
import constants.DistanceUnits;
import constants.Target;

public class Range {

    private Distance normalDistance;
    private Distance maxDistance;
    private Target target;
    private AreaOfEffect areaOfEffect;
    private Distance area;

    public Range(double normalDistance, double maxDistance) {
        this.normalDistance = new Distance(normalDistance, DistanceUnits.FEET);
        this.maxDistance = new Distance(maxDistance, DistanceUnits.FEET);
    }

    public Range(double distance) {
        this.normalDistance = new Distance(distance, DistanceUnits.FEET);
    }

    public Range(Target target) {
        this.target = target;
    }

    public Range(Target target, double area, AreasOfEffect areaOfEffect) {
        this.areaOfEffect = new AreaOfEffect(target, area, areaOfEffect);
    }


}
