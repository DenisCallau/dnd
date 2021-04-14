package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class LocateCreature extends Spell {

    public LocateCreature() {
        name = "Locate Creature";
        level = 4;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a bit of fur from a bloodhound";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "Describe or name a creature that is familiar to you. You sense the direction to the creature's" +
                " location, as long as that creature is within 1,000 feet of you. If the creature is moving, you know" +
                " the direction of its movement.The spell can locate a specific creature known to you, or the nearest" +
                " creature of a specific kind (such as a human or a unicorn), so long as you have seen such a " +
                "creature up close—-within 30 feet-—at least once. If the creature you described or named is in a " +
                "different form, such as being under the effects of a *[polymorph](../polymorph/ 'polymorph (lvl 4)')" +
                "* spell, this spell doesn’t locate the creature.This spell can't locate a creature if running water " +
                "at least 10 feet wide blocks a direct path between you and the creature.";
    }

}
