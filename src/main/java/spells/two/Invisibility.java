package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Invisibility extends Spell {

    public Invisibility() {
        name = "Invisibility";
        level = 2;
        school = Schools.ILLUSION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "an eyelash encased in gum arabic";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(0);
        ritual = false;
        description = "A creature you touch becomes invisible until the spell ends. Anything the target is wearing or" +
                " carrying is invisible as long as it is on the target's person. The spell ends for a target that " +
                "attacks or casts a spell.";
        higherLevels = "When you cast this spell using a spell slot of 3rd level or higher, you can target one " +
                "additional creature for each slot level above 2nd.";
    }

}
