package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Fear extends Spell {

    public Fear() {
        name = "Fear";
        level = 3;
        school = Schools.ILLUSION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a white feather or the heart of a hen";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "You project a phantasmal image of a creature’s worst fears. Each creature in a 30-foot cone " +
                "must succeed on a Wisdom saving throw or drop whatever it is holding and become frightened for the " +
                "duration.While frightened by this spell, a creature must take the Dash action and move away from you" +
                " by the safest available route on each of its turns, unless there is nowhere to move. If the " +
                "creature ends its turn in a location where it doesn’t have line of sight to you, the creature can " +
                "make a Wisdom saving throw. On a successful save, the spell ends for that creature.";
    }

}
