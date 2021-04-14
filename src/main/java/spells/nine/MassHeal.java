package spells.nine;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MassHeal extends Spell {

    public MassHeal() {
        name = "Mass Heal";
        level = 9;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        ritual = false;
        description = "A flood of healing energy flows from you into injured creatures around you. You restore up to " +
                "700 hit points, divided as you choose among any number of creatures that you can see within range. " +
                "Creatures healed by this spell are also cured of all diseases and any effect making them blinded or " +
                "deafened. This spell has no effect on undead or constructs.";
    }

}
