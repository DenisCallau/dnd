package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class SacredFlame extends Spell {

    public SacredFlame() {
        name = "Sacred Flame";
        level = 0;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        ritual = false;
        description = "Flame-like radiance descends on a creature that you can see within range. The target must " +
                "succeed on a Dexterity saving throw or take 1d8 radiant damage. The target gains no benefit from " +
                "cover for this saving throw.The spell’s damage increases by 1d8 when you reach 5th level (2d8), 11th" +
                " level (3d8), and 17th level (4d8).";
    }

}
