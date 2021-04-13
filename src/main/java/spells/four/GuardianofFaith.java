package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class GuardianofFaith extends Spell {

    public GuardianofFaith() {
        name = "Guardian of Faith";
        level = 4;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "A Large spectral guardian appears and hovers for the duration in an unoccupied space of your " +
                "choice that you can see within range. The guardian occupies that space and is indistinct except for " +
                "a gleaming sword and shield emblazoned with the symbol of your deity.Any creature hostile to you " +
                "that moves to a space within 10 feet of the guardian for the first time on a turn must succeed on a " +
                "Dexterity saving throw. The creature takes 20 radiant damage on a failed save, or half as much " +
                "damage on a successful one. The guardian vanishes when it has dealt a total of 60 damage.";
    }

}
