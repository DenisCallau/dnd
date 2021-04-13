package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class TrueStrike extends Spell {

    public TrueStrike() {
        name = "True Strike";
        level = 0;
        school = Schools.DIVINATION;
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.ROUND);
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "You extend your hand and point a finger at a target in range. Your magic grants you a brief " +
                "insight into the target's defenses. On your next turn, you gain advantage on your first attack roll " +
                "against the target, provided that this spell hasn't ended.";
    }

}
