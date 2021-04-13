package spells.eight;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class PowerWordStun extends Spell {

    public PowerWordStun() {
        name = "Power Word Stun";
        level = 8;
        school = Schools.ENCHANTMENT;
        components = new Components[]{
                Components.VERBAL,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "You speak a word of power that can overwhelm the mind of one creature you can see within range, leaving it dumbfounded. If the target has 150 hit points or fewer, it is stunned. Otherwise, the spell has no effect.The stunned target must make a Constitution saving throw at the end of each of its turns.  On a successful save, this stunning effect ends.";
    }

}
