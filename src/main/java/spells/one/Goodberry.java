package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Goodberry extends Spell {

    public Goodberry() {
        name = "Goodberry";
        level = 1;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a sprig of mistletoe";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "Up to ten berries appear in your hand and are infused with magic for the duration. A creature " +
                "can use its action to eat one berry. Eating a berry restores 1 hit point, and the berry provides " +
                "enough nourishment to sustain a creature for a day.The berries lose their potency if they have not " +
                "been consumed within 24 hours of the casting of this spell.";
    }

}
