package spells.one;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class HellishRebuke extends Spell {

    public HellishRebuke() {
        name = "Hellish Rebuke";
        level = 1;
        school = Schools.EVOCATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
//TODO: CHECK CASTING TIME
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "You point your finger, and the creature that damaged you is momentarily surrounded by hellish flames. The creature must make a Dexterity saving throw. It takes 2d10 fire damage on a failed save, or half as much damage on a successful one.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, the damage increases by 1d10 for each slot level above 1st.";
    }

}
