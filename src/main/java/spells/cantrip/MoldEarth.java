package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MoldEarth extends Spell {

    public MoldEarth() {
        name = "Mold Earth";
        level = 0;
        school = Schools.TRANSMUTATION;
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
//TODO: Check duration
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "* If you target an area of loose earth, you can instantaneously excavate it, move it along the" +
                " ground, and deposit it up to 5 feet away. This movement doesn’t have enough force to cause damage.*" +
                " You cause shapes, colors, or both to appear on the dirt or stone, spelling out words, creating " +
                "images, or shaping patterns. The changes last for 1 hour.* If the dirt or stone you target is on the" +
                " ground, you cause it to become difficult terrain. Alternatively, you can cause the ground to become" +
                " normal terrain if it is already difficult terrain. This change lasts for 1 hour.If you cast this " +
                "spell multiple times, you can have no more than two of its non-instantaneous effects active at a " +
                "time, and you can dismiss such an effect as an action.";
    }

}
