package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ScorchingRay extends Spell {

    public ScorchingRay() {
        name = "Scorching Ray";
        level = 2;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(120);
        ritual = false;
        description = "You create three rays of fire and hurl them at targets within range. You can hurl them at one " +
                "target or several.Make a ranged spell attack for each ray. On a hit, the target takes 2d6 fire " +
                "damage.";
        higherLevels = "When you cast this spell using a spell slot of 3rd level or higher, you create one additional" +
                " ray for each slot level above 2nd.";
    }

}
