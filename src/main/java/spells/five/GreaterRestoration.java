package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class GreaterRestoration extends Spell {

    public GreaterRestoration() {
        name = "Greater Restoration";
        level = 5;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "diamond dust worth at least 100 gp, which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(0);
        ritual = false;
        description = "* One effect that charmed or petrified the target* One curse, including the target’s " +
                "attunement to a cursed magic item* Any reduction to one of the target’s ability scores* One effect " +
                "reducing the target’s hit point maximum";
    }

}
