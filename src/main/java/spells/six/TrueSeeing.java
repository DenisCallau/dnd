package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class TrueSeeing extends Spell {

    public TrueSeeing() {
        name = "True Seeing";
        level = 6;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "an ointment for the eyes that costs 25 gp, is made from mushroom powder, saffron, and fat, and is" +
                " consumed by the spell";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "This spell gives the willing creature you touch the ability to see things as they actually are" +
                ". For the duration, the creature has truesight, notices secret doors hidden by magic, and can see " +
                "into the Ethereal Plane, all out to a range of 120 feet.";
    }

}
