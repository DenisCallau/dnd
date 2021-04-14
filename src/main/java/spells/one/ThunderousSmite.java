package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ThunderousSmite extends Spell {

    public ThunderousSmite() {
        name = "Thunderous Smite";
        level = 1;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "The first time you hit with a melee weapon attack during this spell's duration, your weapon " +
                "rings with thunder that is audible within 300 feet of you, and the attack deals an extra 2d6 thunder" +
                " damage to the target. Additionally, if the target is a creature, it must succeed on a Strength " +
                "saving throw or be pushed 10 feet away from you and knocked prone.";
    }

}
