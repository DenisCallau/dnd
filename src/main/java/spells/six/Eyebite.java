package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Eyebite extends Spell {

    public Eyebite() {
        name = "Eyebite";
        level = 6;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "For the spell's duration, your eyes become an inky void imbued with dread power. One creature " +
                "of your choice within 60 feet of you that you can see must succeed on a Wisdom saving throw or be " +
                "affected by one of the following effects of your choice for the duration. On each of your turns " +
                "until the spell ends, you can use your action to target another creature but can't target a creature" +
                " again if it has succeeded on a saving throw against this casting of *eyebite*.";
    }

}
