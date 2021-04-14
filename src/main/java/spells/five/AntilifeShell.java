package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class AntilifeShell extends Spell {

    public AntilifeShell() {
        name = "Antilife Shell";
        level = 5;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "A shimmering barrier extends out from you in a 10-foot radius and moves with you, remaining " +
                "centered on you and hedging out creatures other than undead and constructs. The barrier lasts for " +
                "the duration.The barrier prevents an affected creature from passing or reaching through. An affected" +
                " creature can cast spells or make attacks with ranged or reach weapons through the barrier.If you " +
                "move so an affected creature is forced to pass through the barrier, the spell ends.";
    }

}
