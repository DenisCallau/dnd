package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class WallofFire extends Spell {

    public WallofFire() {
        name = "Wall of Fire";
        level = 4;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a small piece of phosphorus";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(120);
        ritual = false;
        description = "You create a wall of fire on a solid surface within range. You can make the wall up to 60 feet" +
                " long, 20 feet high, and 1 foot thick, or a ringed wall up to 20 feet in diameter, 20 feet high, and" +
                " 1 foot thick. The wall is opaque and lasts for the duration.When the wall appears, each creature " +
                "within its area must make a Dexterity saving throw. On a failed save, a creature takes 5d8 fire " +
                "damage, or half as much damage on a successful save.One side of the wall, selected by you when you " +
                "cast this spell, deals 5d8 fire damage to each creature that ends its turn within 10 feet of that " +
                "side or inside the wall. A creature takes the same damage when it enters the wall for the first time" +
                " on a turn or ends its turn there. The other side of the wall deals no damage.";
        higherLevels = "When you cast this spell using a spell slot of 5th level or higher, the damage increases by " +
                "1d8 for each slot level above 4th.";
    }

}
