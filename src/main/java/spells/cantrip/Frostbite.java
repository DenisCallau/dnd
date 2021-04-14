package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Frostbite extends Spell {

    public Frostbite() {
        name = "Frostbite";
        level = 0;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        ritual = false;
        description = "You cause numbing frost to form on one creature that you can see within range. The target must" +
                " make a Constitution saving throw. On a failed save, the target takes 1d6 cold damage, and it has " +
                "disadvantage on the next weapon attack roll it makes before the end of its next turn.The spell’s " +
                "damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).";
    }

}
