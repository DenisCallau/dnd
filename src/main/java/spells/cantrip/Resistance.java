package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Resistance extends Spell {

    public Resistance() {
        name = "Resistance";
        level = 0;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a miniature cloak";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You touch one willing creature. Once before the spell ends, the target can roll a d4 and add " +
                "the number rolled to one saving throw of its choice. It can roll the die before or after making the " +
                "saving throw. The spell then ends.";
    }

}
