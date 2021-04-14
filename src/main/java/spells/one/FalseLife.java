package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FalseLife extends Spell {

    public FalseLife() {
        name = "False Life";
        level = 1;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a small amount of alcohol or distilled spirits";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "Bolstering yourself with a necromantic facsimile of life, you gain 1d4 + 4 temporary hit " +
                "points for the duration.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, you gain 5 additional " +
                "temporary hit points for each slot level above 1st.";
    }

}
