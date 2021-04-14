package spells.nine;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class PowerWordKill extends Spell {

    public PowerWordKill() {
        name = "Power Word Kill";
        level = 9;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        ritual = false;
        description = "You utter a word of power that can compel one creature you can see within range to die " +
                "instantly.  If the creature you choose has 100 hit points or fewer, it dies. Otherwise, the spell " +
                "has no effect.";
    }

}
