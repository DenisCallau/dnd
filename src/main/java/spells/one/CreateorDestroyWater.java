package spells.one;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class CreateorDestroyWater extends Spell {

    public CreateorDestroyWater() {
        name = "Create or Destroy Water";
        level = 1;
        school = Schools.TRANSMUTATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a drop of water if creating water, or a few grains of sand if destroying it";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "You either create or destroy water.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, you create or destroy 10 additional gallons of water, or the size of the cube increases by 5 feet, for each slot level above 1st.";
    }

}
