package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Catapult extends Spell {

    public Catapult() {
        name = "Catapult";
        level = 1;
        school = Schools.TRANSMUTATION;
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(150);
        ritual = false;
        description = "Choose one object weighing 1 to 5 pounds within range that isn’t being worn or carried. The " +
                "object flies in a straight line up to 90 feet in a direction you choose before falling to the " +
                "ground, stopping early if it impacts against a solid surface. If the object would strike a creature," +
                " that creature must make a Dexterity saving throw. On a failed save, the object strikes the target " +
                "and stops moving. In either case, both the object and the creature or solid surface take 3d8 " +
                "bludgeoning damage.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, the maximum weight of " +
                "objects that you can target with this spell increases by 5 pounds, and the damage increases by 1d8, " +
                "for each slot level above 1st.";
    }

}
