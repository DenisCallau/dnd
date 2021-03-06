package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class HuntersMark extends Spell {

    public HuntersMark() {
        name = "Hunter's Mark";
        level = 1;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(90);
        ritual = false;
        description = "You choose a creature you can see within range and mystically mark it as your quarry. Until " +
                "the spell ends, you deal an extra 1d6 damage to the target whenever you hit it with a weapon attack," +
                " and you have advantage on any Wisdom (Perception) or Wisdom (Survival) check you make to find it. " +
                "If the target drops to 0 hit points before this spell ends, you can use a bonus action on a " +
                "subsequent turn of yours to mark a new creature.";
        higherLevels = "When you cast this spell using a spell slot of 3rd or 4th level, you can maintain your " +
                "concentration on the spell for up to 8 hours. When you use a spell slot of 5th level or higher, you " +
                "can maintain your concentration on the spell for up to 24 hours.";
    }

}
