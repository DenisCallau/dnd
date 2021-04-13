package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MassCureWounds extends Spell {

    public MassCureWounds() {
        name = "Mass Cure Wounds";
        level = 5;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "A wave of healing energy washes out from a point of your choice within range. Choose up to six" +
                " creatures in a 30-foot-radius sphere centered on that point. Each target regains hit points equal " +
                "to 3d8 + your spellcasting ability modifier. This spell has no effect on undead or constructs.";
        higherLevels = "When you cast this spell using a spell slot of 6th level or higher, the healing increases by " +
                "1d8 for each slot level above 5th.";
    }

}
