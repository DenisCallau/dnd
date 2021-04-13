package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class AlterSelf extends Spell {

    public AlterSelf() {
        name = "Alter Self";
        level = 2;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "You assume a different form. When you cast the spell, choose one of the following options, the" +
                " effects of which last for the duration of the spell. While the spell lasts, you can end one option " +
                "as an action to gain the benefits of a different one.";
    }

}
