package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Aid extends Spell {

    public Aid() {
        name = "Aid";
        level = 2;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a tiny strip of white cloth";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "Your spell bolsters your allies with toughness and resolve. Choose up to three creatures " +
                "within range. Each target’s hit point maximum and current hit points increase by 5 for the duration.";
        higherLevels = "When you cast this spell using a spell slot of 3rd level or higher, a target’s hit points " +
                "increase by an additional 5 for each slot level above 2nd.";
    }

}
