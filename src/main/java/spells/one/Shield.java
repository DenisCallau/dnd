package spells.one;

import constants.TimeUnits;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Shield extends Spell {

    public Shield() {
        name = "Shield";
        level = 1;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
//TODO: CHECK CASTING TIME
        duration = new Duration(1, TimeUnits.ROUND);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "An invisible barrier of magical force appears and protects you. Until the start of your next " +
                "turn, you have a +5 bonus to AC, including against the triggering attack, and you take no damage " +
                "from magic missile.";
    }

}
