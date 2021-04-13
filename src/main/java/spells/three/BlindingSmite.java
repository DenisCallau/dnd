package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class BlindingSmite extends Spell {

    public BlindingSmite() {
        name = "Blinding Smite";
        level = 3;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "The next time you hit a creature with a melee weapon attack during this spell’s duration, your" +
                " weapon flares with bright light, and the attack deals an extra 3d8 radiant damage to the target. " +
                "Additionally, the target must succeed on a Constitution saving throw or be blinded until the spell " +
                "ends.A creature blinded by this spell makes another Constitution saving throw at the end of each of " +
                "its turns. On a successful save, it is no longer blinded.";
    }

}
