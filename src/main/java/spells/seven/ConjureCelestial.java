package spells.seven;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ConjureCelestial extends Spell {

    public ConjureCelestial() {
        name = "Conjure Celestial";
        level = 7;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(90);
        target = new Target(Aberbo);
        ritual = false;
        description = "You summon a celestial of challenge rating 4 or lower, which apperas in an unoccupied space " +
                "that you can see within range. The celestial disappears when it drops to 0 hit points or when the " +
                "spell ends.The celestial is friendly to you and your companions for the duration. Roll initiative " +
                "for the celestial, which has its own turns. It obeys any verbal commands that you issue to it (no " +
                "action required by you), as long as they don't violate its alignment. If you don't issue any " +
                "commands to the celestial, it defends itself from hostile creatures but otherwise takes no actions" +
                ".The DM has the celestial's statistics.";
        higherLevels = "When you cast this spell using a 9th-level spell slot, you summon a celestial of challenge " +
                "rating 5 or lower.";
    }

}
