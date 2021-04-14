package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class StaggeringSmite extends Spell {

    public StaggeringSmite() {
        name = "Staggering Smite";
        level = 4;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "The next time you hit a creature with a melee weapon attack during this spell's duration, your" +
                " weapon pierces both body and mind, and the attack deals an extra 4d6 psychic damage to the target. " +
                "The target must make a Wisdom saving throw. On a failed save, it has disadvantage on attack rolls " +
                "and ability checks, and can't take reactions, until the end of its next turn.";
    }

}
