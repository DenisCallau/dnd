package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ExpeditiousRetreat extends Spell {

    public ExpeditiousRetreat() {
        name = "Expeditious Retreat";
        level = 1;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "This spell allows you to move at an incredible pace. When you cast this spell, and then as a " +
                "bonus action on each of your turns until the spell ends, you can take the Dash action.";
    }

}
