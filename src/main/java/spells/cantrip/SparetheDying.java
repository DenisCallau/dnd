package spells.cantrip;

import constants.TimeUnits;
import helpers.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class SparetheDying extends Spell {

    public SparetheDying() {
        name = "Spare the Dying";
        level = 0;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(0);
        ritual = false;
        description = "You touch a living creature that has 0 hit points. The creature becomes stable. This spell has no effect on undead or constructs.";
    }

}
