package spells.three;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class WaterBreathing extends Spell {

    public WaterBreathing() {
        name = "Water Breathing";
        level = 3;
        school = Schools.TRANSMUTATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a short reed or piece of straw";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = true;
        description = "This spell grants up to ten willing creatures you can see within range the abilily to breathe underwater until the spell ends. Affected creatures also retain their normal mode of respiration.";
    }

}
