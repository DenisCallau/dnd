package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class CloudofDaggers extends Spell {

    public CloudofDaggers() {
        name = "Cloud of Daggers";
        level = 2;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a sliver of glass";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(60);
        ritual = false;
        description = "You fill the air with spinning daggers in a cube 5 feet on each side, centered on a point you " +
                "choose within range. A creature takes 4d4 slashing damage when it enters the spell’s area for the " +
                "first time on a turn or starts its turn there.";
        higherLevels = "When you cast this spell using a spell slot of 3rd level or higher, the damage increases by " +
                "2d4 for each slot level above 2nd.";
    }

}
