package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class BlindnessDeafness extends Spell {

    public BlindnessDeafness() {
        name = "Blindness-Deafness";
        level = 2;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(30);
        ritual = false;
        description = "You can blind or deafen a foe. Choose one creature that you can see within range to make a " +
                "Constitution saving throw. If it fails, the target is either blinded or deafened (your choice) for " +
                "the duration. At the end of each of its turns, the target can make a Constitution saving throw. On a" +
                " success, the spell ends.";
        higherLevels = "When you cast this spell using a spell slot of 3rd level or higher, you can target one " +
                "additional creature for each slot level above 2nd.";
    }

}
