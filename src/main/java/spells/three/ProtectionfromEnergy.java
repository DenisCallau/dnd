package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ProtectionfromEnergy extends Spell {

    public ProtectionfromEnergy() {
        name = "Protection from Energy";
        level = 3;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(0);
        ritual = false;
        description = "For the duration, the willing creature you touch has resistance to one damage type of your " +
                "choice: acid, cold, fire, lightning, or thunder.";
    }

}
