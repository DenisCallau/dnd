package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Silence extends Spell {

    public Silence() {
        name = "Silence";
        level = 2;
        school = Schools.ILLUSION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(120);
        ritual = true;
        description = "For the duration, no sound can be created within or pass through a 20-foot-radius sphere " +
                "centered on a point you choose within range. Any creature or object entirely inside the sphere is " +
                "immune to thunder damage, and creatures are deafened while entirely inside it.";
    }

}
