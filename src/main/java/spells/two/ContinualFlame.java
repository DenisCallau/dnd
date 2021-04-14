package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ContinualFlame extends Spell {

    public ContinualFlame() {
        name = "Continual Flame";
        level = 2;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "ruby dust worth 50 gp, which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "A flame, equivalent in brightness to a torch, springs forth from an object that you touch. The" +
                " effect looks like a regular flame, but it creates no heat and doesn't use oxygen. A *continual " +
                "flame* can be covered or hidden but not smothered or quenched.";
    }

}
