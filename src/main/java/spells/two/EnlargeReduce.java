package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class EnlargeReduce extends Spell {

    public EnlargeReduce() {
        name = "Enlarge-Reduce";
        level = 2;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a pinch of powdered iron";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(30);
        ritual = false;
        description = "You cause a creature or an object you can see within range to grow larger or smaller for the " +
                "duration. Choose either a creature or an object that is neither worn nor carried. If the target is " +
                "unwilling, it can make a Constitution saving throw. On a success, the spell has no effect. If the " +
                "target is a creature, everything it is wearing and carrying changes size with it. Any item dropped " +
                "by an affected creature returns to normal size at once.";
    }

}
