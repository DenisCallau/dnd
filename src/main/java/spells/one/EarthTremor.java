package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class EarthTremor extends Spell {

    public EarthTremor() {
        name = "Earth Tremor";
        level = 1;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "You cause a tremor in the ground in a 10-foot radius. Each creature other than you in that " +
                "area must make a Dexterity saving throw. On a failed save, a creature takes 1d6 bludgeoning damage " +
                "and is knocked prone. If the ground in that area is loose earth or stone, it becomes difficult " +
                "terrain until cleared.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, the damage increases by " +
                "1d6 for each slot level above 1st.";
    }

}
