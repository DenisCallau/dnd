package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Tongues extends Spell {

    public Tongues() {
        name = "Tongues";
        level = 3;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.MATERIAL);
        material = "a small clay model of a ziggurat";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "This spell grants the creature you touch the ability to understand any spoken language it " +
                "hears. Moreover, when the target speaks, any creature that knows at least one language and can hear " +
                "the target understands what it says.";
    }

}
