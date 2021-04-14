package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ThornWhip extends Spell {

    public ThornWhip() {
        name = "Thorn Whip";
        level = 0;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "the stem of a plant with thorns";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(30);
        ritual = false;
        description = "You create a long, vine-like whip covered in thorns that lashes out at your command toward a " +
                "creature in range. Make a melee spell attack against the target. If the attack hits, the creature " +
                "takes 1d6 piercing damage, and if the creature is Large or smaller, you pull the creature up to 10 " +
                "feet closer to you.This spell's damage increases by 1d6 when you reach 5th level (2d6), 11th level " +
                "(3d6), and 17th level (4d6).";
    }

}
