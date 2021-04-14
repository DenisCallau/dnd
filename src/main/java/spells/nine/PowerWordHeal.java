package spells.nine;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class PowerWordHeal extends Spell {

    public PowerWordHeal() {
        name = "Power Word Heal";
        level = 9;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(0);
        ritual = false;
        description = "A wave of healing energy washes over the creature you touch. The target regains all its hit " +
                "points. If the creature is charmed, frightened, paralyzed, or stunned, the condition ends. If the " +
                "creature is prone, it can use its reaction to stand up. This spell has no effect on undead or " +
                "constructs.";
    }

}
