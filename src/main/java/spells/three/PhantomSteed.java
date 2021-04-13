package spells.three;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class PhantomSteed extends Spell {

    public PhantomSteed() {
        name = "Phantom Steed";
        level = 3;
        school = Schools.ILLUSION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = true;
        description = "A Large quasi-real, horselike creature appears on the ground in an unoccupied space of your choice within range. You decide the creature�s appearance, but it is equipped with a saddle, bit, and bridle. Any of the equipment created by the spell vanishes in a puff of smoke if it is carried more than 10 feet away from the steed.For the duration, you or a creature you choose can ride the steed. The creature uses the statistics for a riding horse, except it has a speed of 100 feet and can travel 10 miles in an hour, or 13 miles at a fast pace. When the spell ends, the steed gradually fades, giving the rider 1 minute to dismount. The spell ends if you use an action to dismiss it or if the steed takes any damage.";
    }

}
