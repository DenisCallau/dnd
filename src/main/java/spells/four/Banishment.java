package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Banishment extends Spell {

    public Banishment() {
        name = "Banishment";
        level = 4;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "an item distasteful to the target";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(60);
        ritual = false;
        description = "You attempt to send one creature that you can see within range to another plane of existence. " +
                "The target must succeed on a Charisma saving throw or be banished.If the target is native to the " +
                "plane of existance you're on, you banish the target to a harmless demiplane. While there, the target" +
                " is incapacitated. The target remains there until the spell ends, at which point the target " +
                "reappears in the space it left or in the nearest unoccupied space if that space is occupied.If the " +
                "target is native to a different plane of existance than the one you're on, the target is banished " +
                "with a faint popping noise, returning to its home plane. If the spell ends before 1 minute has " +
                "passed, the target reappears in the space it left or in the nearest unoccupied space if that space " +
                "is occupied. Otherwise, the target doesn't return.";
        higherLevels = "When you cast this spell using a spell slot of 5th level or higher, you can target one " +
                "additional creature for each slot level above 4th.";
    }

}
