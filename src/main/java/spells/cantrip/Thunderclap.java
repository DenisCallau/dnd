package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Thunderclap extends Spell {

    public Thunderclap() {
        name = "Thunderclap";
        level = 0;
        school = Schools.EVOCATION;
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create a burst of thunderous sound, which can be heard 100 feet away. Each creature other " +
                "than you within 5 feet of you must make a Constitution saving throw. On a failed save, the creature " +
                "takes 1d6 thunder damage.The spell’s damage increases by 1d6 when you reach 5th level (2d6), 11th " +
                "level (3d6), and 17th level (4d6).";
    }

}
