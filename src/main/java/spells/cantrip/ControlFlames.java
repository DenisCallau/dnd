package spells.cantrip;

import constants.TimeUnits;
import helpers.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ControlFlames extends Spell {

    public ControlFlames() {
        name = "Control Flames";
        level = 0;
        school = Schools.TRANSMUTATION;
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
//TODO: Check duration
        range = new Range(60);
        ritual = false;
        description = "* You instantaneously expand the flame 5 feet in one direction, provided that wood or other fuel is present in the new location.* You instantaneously extinguish the flames within the cube.* You double or halve the area of bright light and dim light cast by the flame, change its color, or both. The change lasts for 1 hour.* You cause simple shapes—such as the vague form of a creature, an inanimate object, or a location—to appear within the flames and animate as you like. The shapes last for 1 hour.If you cast this spell multiple times, you can have up to three of its non-instantaneous effects active at a time, and you can dismiss such an effect as an action.";
    }

}
