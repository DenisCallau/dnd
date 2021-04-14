package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class IceStorm extends Spell {

    public IceStorm() {
        name = "Ice Storm";
        level = 4;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a pinch of dust and a few drops of water";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(300);
        ritual = false;
        description = "A hail of rock-hard ice pounds to the ground in a 20-foot-radius, 40-foot-high cylinder " +
                "centered on a point within range. Each creature in the cylinder must make a Dexterity saving throw. " +
                "A creature takes 2d8 bludgeoning damage and 4d6 cold damage on a failed save, or half as much damage" +
                " on a successful one.Hailstones turn the storm’s area of effect into difficult terrain until the end" +
                " of your next turn.";
        higherLevels = "When you cast this spell using a spell slot of 5th level or higher, the bludgeoning damage " +
                "increases by 1d8 for each slot level above 4th.";
    }

}
