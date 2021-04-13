package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FireBolt extends Spell {

    public FireBolt() {
        name = "Fire Bolt";
        level = 0;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(120);
        target = new Target(Aberbo);
        ritual = false;
        description = "You hurl a mote of fire at a creature or object within range. Make a ranged spell attack " +
                "against the target. On a hit, the target takes 1d10 fire damage. A flammable object hit by this " +
                "spell ignites if it isn't being worn or carried. This spell’s damage increases by 1d10 when you " +
                "reach 5th level (2d10), 11th level (3d10), and 17th level (4d10).";
    }

}
