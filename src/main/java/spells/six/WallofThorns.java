package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class WallofThorns extends Spell {

    public WallofThorns() {
        name = "Wall of Thorns";
        level = 6;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a handful of thorns";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(120);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create a wall of tough, pliable, tangled brush bristling with needle-sharp thorns. The " +
                "wall appears within range on a solid surface and lasts for the duration. You choose to make the wall" +
                " up to 60 feet long, 10 feet high, and 5 feet thick or a circle that has a 20-foot diameter and is " +
                "up to 20 feet high and 5 feet thick. The wall blocks line of sight.When the wall appears, each " +
                "creature within its area must make a Dexterity saving throw. On a failed save, a creature takes 7d8 " +
                "piercing damage, or half as much damage on a successful save.A creature can move through the wall, " +
                "albeit slowly and painfully. For every 1 foot a creature moves through the wall, it must spend 4 " +
                "feet of movement. Furthermore, the first time a creature enters the wall on a turn or ends its turn " +
                "there, the creature must make a Dexterity saving throw. It takes 7d8 slashing damage on a failed " +
                "save, or half as much damage on a successful one.";
        higherLevels = "When you cast this spell using a spell slot o f 7th level or higher, both types of damage " +
                "increase by 1d8 for each slot level above 6th.";
    }

}
