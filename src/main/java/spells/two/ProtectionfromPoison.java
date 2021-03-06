package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ProtectionfromPoison extends Spell {

    public ProtectionfromPoison() {
        name = "Protection from Poison";
        level = 2;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        ritual = false;
        description = "You touch a creature. If it is poisoned, you neutralize the poison. If more than one poison " +
                "afflicts the target, you neutralize one poison that you know is present, or you neutralize one at " +
                "random. For the duration, the target has advantage on saving throws against being poisoned, and it " +
                "has resistance to poison damage.";
    }

}
