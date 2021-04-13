package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Gust extends Spell {

    public Gust() {
        name = "Gust";
        level = 0;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "* One Medium or smaller creature that you choose must succeed on a Strength saving throw or be" +
                " pushed up to 5 feet away from you.* You create a small blast of air capable of moving one object " +
                "that is neither held nor carried and that weighs no more than 5 pounds. The object is pushed up to " +
                "10 feet away from you. It isn’t pushed with enough force to cause damage.* You create a harmless " +
                "sensory affect using air, such as causing leaves to rustle, wind to slam shutters shut, or your " +
                "clothing to ripple in a breeze.";
    }

}
