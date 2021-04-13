package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ShockingGrasp extends Spell {

    public ShockingGrasp() {
        name = "Shocking Grasp";
        level = 0;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "Lightning springs from your hand to deliver a shock to a creature you try to touch. Make a " +
                "melee spell attack against the target. You have advantage on the attack roll if the target is " +
                "wearing armor made of metal. On a hit, the target takes 1d8 lightning damage, and it can’t take " +
                "reactions until the start of its next turn.The spell’s damage increases by 1d8 when you reach 5th " +
                "level (2d8), 11th level (3d8), and 17th level (4d8).";
    }

}
