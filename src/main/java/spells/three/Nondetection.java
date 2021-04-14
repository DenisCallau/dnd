package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Nondetection extends Spell {

    public Nondetection() {
        name = "Nondetection";
        level = 3;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a pinch of diamond dust worth 25 gp sprinkled over the target, which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        ritual = false;
        description = "For the duration, you hide a target that you touch from divination magic. The target can be a " +
                "willing creature or a place or an object no larger than 10 feet in any dimension. The target can’t " +
                "be targeted by any divination magic or perceived through magical scrying sensors.";
    }

}
