package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class GustofWind extends Spell {

    public GustofWind() {
        name = "Gust of Wind";
        level = 2;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a legume seed";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "A line of strong wind 60 feet long and 10 feet wide blasts from you in a direction you choose " +
                "for the spell's duration. Each creature that starts its turn in the line must succeed on a Strength " +
                "saving throw or be pushed 15 feet away from you in a direction following the line.Any creature in " +
                "the line must spend 2 feet of movement for every 1 foot it moves when moving closer to you.The gust " +
                "disperses gas or vapor, and it extinguishes candles, torches, and similar unprotected flames in the " +
                "area. It causes protected fiames, such as those of lanterns, to dance wildly and has a 50 percent " +
                "chance to extinguish them.As a bonus action on each of your turns before the spell ends, you can " +
                "change the direction in which the line blasts from you.";
    }

}
