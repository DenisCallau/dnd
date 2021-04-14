package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class LesserRestoration extends Spell {

    public LesserRestoration() {
        name = "Lesser Restoration";
        level = 2;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(0);
        ritual = false;
        description = "You touch a creature and can end either one disease or one condition afflicting it. The " +
                "condition can be blinded, deafened, paralyzed, or poisoned.";
    }

}
