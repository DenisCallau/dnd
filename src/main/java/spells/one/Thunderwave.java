package spells.one;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Thunderwave extends Spell {

    public Thunderwave() {
        name = "Thunderwave";
        level = 1;
        school = Schools.EVOCATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "A wave of thunderous force sweeps out from you. Each creature in a 15-foot cube originating from you must make a Constitution saving throw. On a failed save, a creature takes 2d8 thunder damage and is pushed 10 feet away from you. On a successful save, the creature takes half as much damage and isn�t pushed. In addition, unsecured objects that are completely within the area of effect are automatically pushed 10 feet away from you by the spell�s effect, and the spell emits a thunderous boom audible out to 300 feet.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, the damage increases by 1d8 for each slot level above 1st.";
    }

}
