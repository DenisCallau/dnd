package spells.cantrip;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Guidance extends Spell {

    public Guidance() {
        name = "Guidance";
        level = 0;
        school = Schools.DIVINATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You touch one willing creature. Once before the spell ends, the target can roll a d4 and add the number rolled to one ability check of its choice. It can roll the die before or after making the ability check. The spell then ends.";
    }

}
