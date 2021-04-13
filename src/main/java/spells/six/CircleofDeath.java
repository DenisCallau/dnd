package spells.six;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class CircleofDeath extends Spell {

    public CircleofDeath() {
        name = "Circle of Death";
        level = 6;
        school = Schools.NECROMANCY;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "the powder of a crushed black pearl worth at least 500 gp";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(150);
        target = new Target(Aberbo);
        ritual = false;
        description = "A sphere of negative energy ripples out in a 60-foot- radius sphere from a point within range. Each creature in that area must make a Constitution saving throw. A target takes 8d6 necrotic damage on a failed save, or half as much damage on a successful one.";
        higherLevels = "When you cast this spell using a spell slot of 7th level or higher, the damage increases by 2d6 for each slot level above 6th.";
    }

}
