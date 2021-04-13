package spells.three;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class RemoveCurse extends Spell {

    public RemoveCurse() {
        name = "Remove Curse";
        level = 3;
        school = Schools.ABJURATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "At your touch, all curses affecting one creature or object end. If the object is a cursed magical item, its curse remains, but the spell breaks its owner's attunement to the object so it can be removed or discarded.";
    }

}
