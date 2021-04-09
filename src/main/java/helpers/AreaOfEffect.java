package helpers;

import constants.AreasOfEffect;
import constants.Target;

public class AreaOfEffect extends Measure {

    private Target target;
    private AreasOfEffect areasOfEffect;

    public AreaOfEffect(Target target, double qty, AreasOfEffect areasOfEffect) {
        this.qty = qty;
        this.target = target;
        this.areasOfEffect = areasOfEffect;
    }
}
