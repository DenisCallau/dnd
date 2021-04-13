package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Heal extends Spell {

    public Heal() {
        name = "Heal";
        level = 6;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "Choose a creature that you can see within range. A surge of positive energy washes through the" +
                " creature, causing it to regain 70 hit points. This spell also ends blindness, deafness, and any " +
                "diseases affecting the target. This spell has no effect on constructs or undead.";
        higherLevels = "When you cast this spell using a spell slot of 7th level or higher, the amount of healing " +
                "increases by 10 for each slot level above 6th.";
    }

}
