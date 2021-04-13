package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class BurningHands extends Spell {

    public BurningHands() {
        name = "Burning Hands";
        level = 1;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "As you hold your hands with thumbs touching and fingers spread, a thin sheet of flames shoots " +
                "forth from your outstretched fingertips. Each creature in a 15-foot cone must make a Dexterity " +
                "saving throw. A creature takes 3d6 fire damage on a failed save, or half as much damage on a " +
                "successful one.The fire ignites any flammable objects in the area that aren’t being worn or carried.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, the damage increases by " +
                "1d6 for each slot level above 1st.";
    }

}
