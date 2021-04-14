package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FlameArrows extends Spell {

    public FlameArrows() {
        name = "Flame Arrows";
        level = 3;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(0);
        ritual = false;
        description = "You touch a quiver containing arrows or bolts. When a target is hit by a ranged weapon attack " +
                "using a piece of ammunition drawn from the quiver, the target takes an extra 1d6 fire damage. The " +
                "spell’s magic ends on the piece of ammunition when it hits or misses, and the spell ends when twelve" +
                " pieces of ammunition have been drawn from the quiver.";
        higherLevels = "When you cast this spell using a spell slot of 4th level or higher, the number of pieces of " +
                "ammunition you can affect with this spell increases by two for each slot level above 3rd.";
    }

}
