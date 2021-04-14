package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Stoneskin extends Spell {

    public Stoneskin() {
        name = "Stoneskin";
        level = 4;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "diamond dust worth 100 gp, which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(0);
        ritual = false;
        description = "This spell turns the flesh of a willing creature you touch as hard as stone. Until the spell " +
                "ends, the target has resistance to nonmagical bludgeoning, piercing, and slashing damage.";
    }

}
