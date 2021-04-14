package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class WrathfulSmite extends Spell {

    public WrathfulSmite() {
        name = "Wrathful Smite";
        level = 1;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "The next time you hit with a melee weapon attack during this spell's duration, your attack " +
                "deals an extra 1d6 psychic damage. Additionally, if the target is a creature, it must make a Wisdom " +
                "saving throw or be frightened of you until the spell ends. As an action, the creature can make a " +
                "Wisdom check against your spell save DC to steel its resolve and end this spell.";
    }

}
