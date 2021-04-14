package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class HealingWord extends Spell {

    public HealingWord() {
        name = "Healing Word";
        level = 1;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        ritual = false;
        description = "A creature of your choice that you can see within range regains hit points equal to 1d4 + your" +
                " spellcasting ability modifier. This spell has no effect on undead or constructs.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, the healing increases by " +
                "1d4 for each slot level above 1st.";
    }

}
