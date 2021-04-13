package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Mending extends Spell {

    public Mending() {
        name = "Mending";
        level = 0;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "two lodestones";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "This spell repairs a single break or tear in an object you touch, such as a broken key, a torn" +
                " cloak, or a leaking wineskin. As long as the break or tear is no longer than 1 foot in any " +
                "dimension, you mend it, leaving no trace of the former damage.This spell can physically repair a " +
                "magic item or construct, but the spell can’t restore magic to such an object.";
    }

}
