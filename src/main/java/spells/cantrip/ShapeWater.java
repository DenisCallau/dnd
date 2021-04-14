package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ShapeWater extends Spell {

    public ShapeWater() {
        name = "Shape Water";
        level = 0;
        school = Schools.TRANSMUTATION;
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
//TODO: Check duration
        range = new Range(30);
        ritual = false;
        description = "* You instantaneously move or otherwise change the flow of the water as you direct, up to 5 " +
                "feet in any direction. This movement doesn’t have enough force to cause damage.* You cause the water" +
                " to form into simple shapes and animate at your direction. This change lasts for 1 hour.* You change" +
                " the water’s color or opacity. The water must be changed in the same way throughout. This change " +
                "lasts for 1 hour.* You freeze the water, provided that there are no creatures in it. The water " +
                "unfreezes in 1 hour.If you cast this spell multiple times, you can have no more than two of its " +
                "non-instantaneous effects active at a time, and you can dismiss such an effect as an action.";
    }

}
