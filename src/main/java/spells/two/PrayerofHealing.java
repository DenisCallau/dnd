package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class PrayerofHealing extends Spell {

    public PrayerofHealing() {
        name = "Prayer of Healing";
        level = 2;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(10, TimeUnits.MINUTE);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "Up to six creatures of your choice that you can see within range each regain hit points equal " +
                "to 2d8 + your spellcasting ability modifier. This spell has no effect on undead or constructs.";
        higherLevels = "When you cast this spell using a spell slot of 3rd level or higher, the healing increases by " +
                "1d8 for each slot level above 2nd.";
    }

}
