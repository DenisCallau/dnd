package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class PrimordialWard extends Spell {

    public PrimordialWard() {
        name = "Primordial Ward";
        level = 6;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "You have resistance to acid, cold, fire, lightning, and thunder damage for the spell’s " +
                "duration.When you take damage of one of those types, you can use your reaction to gain immunity to " +
                "that type of damage, including against the triggering damage. If you do so, the resistances end, and" +
                " you have the immunity until the end of your next turn, at which time the spell ends.";
    }

}
