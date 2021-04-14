package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class PoisonSpray extends Spell {

    public PoisonSpray() {
        name = "Poison Spray";
        level = 0;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(10);
        ritual = false;
        description = "You extend your hand toward a creature you can see within range and project a puff of noxious " +
                "gas from your palm. The creature must succeed on a Constitution saving throw or take 1d12 poison " +
                "damage.This spell's damage increases by 1d12 when you reach 5th level (2d12), 11th level (3d12), and" +
                " 17th level (4d12).";
    }

}
