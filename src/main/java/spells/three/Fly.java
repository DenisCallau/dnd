package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Fly extends Spell {

    public Fly() {
        name = "Fly";
        level = 3;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a wing feather from any bird";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You touch a willing creature. The target gains a flying speed of 60 feet for the duration. " +
                "When the spell ends, the target falls if it is still aloft, unless it can stop the fall.";
        higherLevels = "When you cast this spell using a spell slot of 4th level or higher, you can target one " +
                "additional creature for each slot level above 3rd.";
    }

}
