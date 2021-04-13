package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class PlantGrowth extends Spell {

    public PlantGrowth() {
        name = "Plant Growth";
        level = 3;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        castingTime = new CastingTime(1, TimeUnits.HOUR);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(150);
        target = new Target(Aberbo);
        ritual = false;
        description = "This spell channels vitality into plants within a specific area. There are two possible uses " +
                "for the spell, granting either immediate or long-term benefits.If you cast this spell using 1 " +
                "action, choose a point within range. All normal plants in a 100-foot radius centered on that point " +
                "become thick and overgrown. A creature moving through the area must spend 4 feet of movement for " +
                "every 1 foot it moves.You can exclude one or more areas of any size within the spell’s area from " +
                "being affected.If you cast this spell over 8 hours, you enrich the land. All plants in a half-mile " +
                "radius centered on a point within range become enriched for 1 year. The plants yield twice the " +
                "normal amount of food when harvested.";
    }

}
