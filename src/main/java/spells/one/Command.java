package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Command extends Spell {

    public Command() {
        name = "Command";
        level = 1;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(1, TimeUnits.ROUND);
        range = new Range(60);
        ritual = false;
        description = "You speak a one-word command to a creature you can see within range. The target must succeed " +
                "on a Wisdom saving throw or follow the command on its next turn. The spell has no effect if the " +
                "target is undead, if it doesn’t understand your language, or if your command is directly harmful to " +
                "it.Some typical commands and their effects follow. You might issue a command other than one " +
                "described here. If you do so, the DM determines how the target behaves. If the target can’t follow " +
                "your command, the spell ends.ends its turn.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, you can affect one " +
                "additional creature for each slot level above 1st. The creatures must be within 30 feet of each " +
                "other when you target them.";
    }

}
