package spells.two;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class GentleRepose extends Spell {

    public GentleRepose() {
        name = "Gentle Repose";
        level = 2;
        school = Schools.NECROMANCY;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a pinch of salt and one copper piece placed on each of the corpse's eyes, which must remain there for the duration";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = true;
        description = "You touch a corpse or other remains. For the duration, the target is protected from decay and can�t become undead.The spell also effectively extends the time limit on raising the target from the dead, since days spent under the influence of this spell don�t count against the time limit of spells such as *[raise dead](../raise-dead/ "raise dead (lvl 5)")*.";
    }

}
