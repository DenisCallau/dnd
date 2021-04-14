package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class HoldMonster extends Spell {

    public HoldMonster() {
        name = "Hold Monster";
        level = 5;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a small, straight piece of iron";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(90);
        ritual = false;
        description = "Choose a creature that you can see within range. The target must succeed on a Wisdom saving " +
                "throw or be paralyzed for the duration. This spell has no effect on undead. At the end of each of " +
                "its turns, the target can make another Wisdom saving throw. On a success, the spell ends on the " +
                "target.";
        higherLevels = "When you cast this spell using a spell slot of 6th level or higher, you can target one " +
                "additional creature for each slot level above 5th. The creatures must be within 30 feet of each " +
                "other when you target them.";
    }

}
