package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class HoldPerson extends Spell {

    public HoldPerson() {
        name = "Hold Person";
        level = 2;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a small, straight piece of iron";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = true;
        description = "Choose a humanoid that you can see within range. The target must succeed on a Wisdom saving " +
                "throw or be paralyzed for the duration. At the end of each of its turns, the target can make another" +
                " Wisdom saving throw. On a success, the spell ends on the target.";
        higherLevels = "When you cast this spell using a spell slot of 3rd level or higher, you can target one " +
                "additional humanoid for each slot level above 2nd. The humanoids must be within 30 feet of each " +
                "other when you target them.";
    }

}
