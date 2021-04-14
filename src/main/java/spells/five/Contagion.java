package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Contagion extends Spell {

    public Contagion() {
        name = "Contagion";
        level = 5;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        ritual = false;
        description = "Your touch inflicts disease. Make a melee spell attack against a creature within your reach. " +
                "On a hit, you afflict the creature with a disease of your choice from any of the ones described " +
                "below.At the end of each of the target's turns, it must make a Constitution saving throw. After " +
                "failing three of these saving throws, the disease's effects last for the duration, and the creature " +
                "stops making these saves. After succeeding on three of these saving throws, the creature recovers " +
                "from the disease, and the spell ends.Since this spell induces a natural disease in its target, any " +
                "effect that removes a disease or otherwise ameliorates a disease's effects apply to it.";
    }

}
