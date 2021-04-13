package spells.four;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class GreaterInvisibility extends Spell {

    public GreaterInvisibility() {
        name = "Greater Invisibility";
        level = 4;
        school = Schools.ILLUSION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You or a creature you touch becomes invisible until the spell ends. Anything the target is wearing or carrying is invisible as long as it is on the target�s person.";
    }

}
