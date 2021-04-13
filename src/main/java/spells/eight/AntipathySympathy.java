package spells.eight;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class AntipathySympathy extends Spell {

    public AntipathySympathy() {
        name = "Antipathy-Sympathy";
        level = 8;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "either a hump of alum soaked in vinegar for the _antipathy_ effect or a drop of honey for the " +
                "_sympathy_ effect";
        castingTime = new CastingTime(1, TimeUnits.HOUR);
//TODO: CHECK DURATION
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "This spell attracts or repels creatures of your choice. You target something within range, " +
                "either a Huge or smaller object or creature or an erea that is no larger than a 200-foot cube. Then " +
                "specify a kind of intelligent creature such as red dragons, goblins or vampires. You invest the " +
                "target with an aura that either attracts or repels the specified creatures for the duration. Choose " +
                "antipathy or sympathy as the aura's effect.If the target damages or otherwise harms an affected " +
                "creature, the affected creature can make a Wisdom saving throw to end the effect, as described below" +
                ".A creature that successfully saves against this affect is immune to it for 1 minute, after which " +
                "time it can be affected again.";
    }

}
