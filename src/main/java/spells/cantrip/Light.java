package spells.cantrip;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Light extends Spell {

    public Light() {
        name = "Light";
        level = 0;
        school = Schools.EVOCATION;
        components = new Components[]{
                Components.VERBAL,
                Components.MATERIAL
        };
        String material = "a firefly or phosphorescent moss";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You touch one object that is no larger than 10 feet in any dimension. Until the spell ends, the object sheds bright light in a 20-foot radius and dim light for an additional 20 feet. The light can be colored as you like. Completely covering the object with something opaque blocks the light. The spell ends if you cast it again or dismiss it as an action.If you target an object held or worn by a hostile creature, that creature must succeed on a Dexterity saving throw to avoid the spell.";
    }

}
