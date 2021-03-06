package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class BonesoftheEarth extends Spell {

    public BonesoftheEarth() {
        name = "Bones of the Earth";
        level = 6;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(120);
        ritual = false;
        description = "You cause up to six pillars of stone to burst from places on the ground that you can see " +
                "within range. Each pillar is a cylinder that has a diameter of 5 feet and a height of up to 30 feet." +
                " The ground where a pillar appears must be wide enough for its diameter, and you can target ground " +
                "under a creature if that creature is Medium or smaller. Each pillar has AC 5 and 30 hit points. When" +
                " reduced to 0 hit points, a pillar crumbles into rubble, which creates an area of difficult terrain " +
                "with a 10-foot radius. The rubble lasts until cleared.If a pillar is created under a creature, that " +
                "creature must succeed on a Dexterity saving throw or be lifted by the pillar. A creature can choose " +
                "to fail the save.If a pillar is prevented from reaching its full height because of a ceiling or " +
                "other obstacle, a creature on the pillar takes 6d6 bludgeoning damage and is restrained, pinched " +
                "between the pillar and the obstacle. The restrained creature can use an action to make a Strength or" +
                " Dexterity check (the creature’s choice) against the spell’s saving throw DC. On a success, the " +
                "creature is no longer restrained and must either move off the pillar or fall off it.";
        higherLevels = "When you cast this spell using a spell slot of 7th level or higher, you can create two " +
                "additional pillars for each slot level above 6th.";
    }

}
