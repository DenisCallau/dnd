package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class SeeInvisibility extends Spell {

    public SeeInvisibility() {
        name = "See Invisibility";
        level = 2;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a pinch of tale and a small sprinkling of powdered silver";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "For the duration, you see invisible creatures and objects as if they were visible, and you can" +
                " see into the Ethereal Plane. Ethereal creatures and objects appear ghostly and translucent.";
    }

}
