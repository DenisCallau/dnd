package spells.three;

import constants.TimeUnits;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Counterspell extends Spell {

    public Counterspell() {
        name = "Counterspell";
        level = 3;
        school = Schools.ABJURATION;
        components.add(Components.SOMATIC);
//TODO: CHECK CASTING TIME
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        ritual = false;
        description = "You attempt to interrupt a creature in the process of casting a spell. If the creature is " +
                "casting a spell of 3rd level or lower, its spell fails and has no effect. If it is casting a spell " +
                "of 4th level or higher, make an ability check using your spellcasting ability. The DC equals 10 + " +
                "the spell’s level. On a success, the creature’s spell fails and has no effect.";
        higherLevels = "When you cast this spell using a spell slot of 4th level or higher, the interrupted spell has" +
                " no effect if its level is less than or equal to the level of the spell slot you used.";
    }

}
