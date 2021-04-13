package spells.one;

import constants.TimeUnits;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class AbsorbElements extends Spell {

    public AbsorbElements() {
        name = "Absorb Elements";
        level = 1;
        school = Schools.ABJURATION;
        components.add(Components.SOMATIC);
//TODO: CHECK CASTING TIME
        duration = new Duration(1, TimeUnits.ROUND);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "The spell captures some of the incoming energy, lessening its effect on you and storing it for" +
                " your next melee attack. You have resistance to the triggering damage type until the start of your " +
                "next turn. Also, the first time you hit with a melee attack on your next turn, the target takes an " +
                "extra 1d6 damage of the triggering type, and the spell ends.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, the extra damage " +
                "increases by 1d6 for each slot level above 1st.";
    }

}
