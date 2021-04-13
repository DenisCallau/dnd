package spells.two;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ContinualFlame extends Spell {

    public ContinualFlame() {
        name = "Continual Flame";
        level = 2;
        school = Schools.EVOCATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "ruby dust worth 50 gp, which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "A flame, equivalent in brightness to a torch, springs forth from an object that you touch. The effect looks like a regular flame, but it creates no heat and doesn't use oxygen. A *continual flame* can be covered or hidden but not smothered or quenched.";
    }

}
