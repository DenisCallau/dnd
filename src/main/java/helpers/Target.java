package helpers;

import constants.AreasOfEffect;

public class Target {

    private constants.Target target;
    private constants.Target[] targets;
    private AreaOfEffect areaOfEffect;

    public Target(constants.Target target) {
        this.target = target;
    }

    public Target(constants.Target... targets) {
        this.targets = targets;
    }

    public Target(double area, AreasOfEffect areaOfEffect) {
        this.areaOfEffect = new AreaOfEffect(constants.Target.POINT, area, areaOfEffect);
    }

}
