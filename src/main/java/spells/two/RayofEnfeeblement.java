package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class RayofEnfeeblement extends Spell {

    public RayofEnfeeblement() {
        name = "Ray of Enfeeblement";
        level = 2;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(60);
        ritual = false;
        description = "A black beam of enervating energy springs from your finger toward a creature within range. " +
                "Make a ranged spell attack against the target. On a hit, the target deals only half damage with " +
                "weapon attacks that use Strength until the spell ends.At the end of each of the target's turns, it " +
                "can make a Constitution saving throw against the spell. On a success, the spell ends.";
    }

}
