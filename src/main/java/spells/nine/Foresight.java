package spells.nine;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Foresight extends Spell {

    public Foresight() {
        name = "Foresight";
        level = 9;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a hummingbird feather";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You touch a willing creature and bestow a limited ability to see into the immediate future. " +
                "For the duration the target can't be surprised and has advantage on attack rolls, ability checks, " +
                "and saving throws. Additionally, other creatures have disadvantage on attack rolls against the " +
                "target for the duration.This spell immediately ends if you cast it again before its duration ends.";
    }

}
