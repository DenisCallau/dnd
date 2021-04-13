package spells.seven;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class DivineWord extends Spell {

    public DivineWord() {
        name = "Divine Word";
        level = 7;
        school = Schools.EVOCATION;
        components = new Components[]{
                Components.VERBAL,
        };
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "Regardless of its current hit points, a celestial, an element, a fey or a fiend that fails its save is forced back to its plane of origin (if it isn't there already) and can't return to your current plane for 24 hours by any means short of a _wish_ spell.";
    }

}
