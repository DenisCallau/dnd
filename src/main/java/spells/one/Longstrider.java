package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Longstrider extends Spell {

    public Longstrider() {
        name = "Longstrider";
        level = 1;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a pinch of dirt";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You touch a creature. The target's speed increases by 10 feet until the spell ends.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, you can target one " +
                "additional creature for each spell slot above 1st.";
    }

}
