package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class InsectPlague extends Spell {

    public InsectPlague() {
        name = "Insect Plague";
        level = 5;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a few grains of sugar, some kernels of grain, and a smear of fat";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(300);
        ritual = false;
        description = "Swarming, biting locusts fill a 20-foot-radius sphere centered on a point you choose within " +
                "range, The sphere spreads around corners. The sphere remains for the duration, and its area is " +
                "lightly obscured. The sphere's area is difficult terrain.When the area appears, each creature in it " +
                "must make a Constitution saving throw. A creature takes 4d10 piercing damage on a failed save, or " +
                "half as much damage on a successful one. A creature must also make this saving throw when it enters " +
                "the spell's area for the first time on a turn or ends its turn there.";
        higherLevels = "When you cast this spell using a spell slot of 6th levei or higher, the damage increases by " +
                "1d10 for each slot level above 5th.";
    }

}
