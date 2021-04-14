package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FlameStrike extends Spell {

    public FlameStrike() {
        name = "Flame Strike";
        level = 5;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "pinch of sulfur";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        ritual = false;
        description = "A vertical column of divine fire roars down from the heavens in a location you specify. Each " +
                "creature in a 10-foot radius, 40-foot-high cylinder centered on a point within range must make a " +
                "Dexterity saving throw. A creature takes 4d6 fire damage and 4d6 radiant damage on a failed save, or" +
                " half as much damage on a successful one.";
        higherLevels = "When you cast this spell using a spell slot of 6th level or higher, the fire damage or the " +
                "radiant damage (your choice) inceases by 1d6 for each slot level above 5th.";
    }

}
