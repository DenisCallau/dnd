package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MagicMissile extends Spell {

    public MagicMissile() {
        name = "Magic Missile";
        level = 1;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(120);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create three glowing darts of magical force. Each dart hits a creature of your choice that" +
                " you can see within range. A dart deals 1d4 + 1 force damage to its target. The darts all strike " +
                "simultaneously, and you can direct them to hit one creature or several.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, the spell creates one " +
                "more dart for each slot level above 1st.";
    }

}
