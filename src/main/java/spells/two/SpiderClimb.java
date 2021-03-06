package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class SpiderClimb extends Spell {

    public SpiderClimb() {
        name = "Spider Climb";
        level = 2;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a drop of bitumen and a spider";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(0);
        ritual = false;
        description = "Until the spell ends, one willing creature you touch gains the ability to move up, down, and " +
                "across vertical surfaces and upside down along ceilings, while leaving its hands free. The target " +
                "also gains a c1imbing speed equal to its walking speed.";
    }

}
