package spells.two;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Blur extends Spell {

    public Blur() {
        name = "Blur";
        level = 2;
        school = Schools.ILLUSION;
        components = new Components[]{
                Components.VERBAL,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "Your body becomes blurred, shifting and wavering to all who can see you. For the duration, any creature has disadvantage on attack rolls against you. An attacker is immune to this effect if it doesn�t rely on sight, as with blindsight, or can see through illusions, as with truesight.";
    }

}
