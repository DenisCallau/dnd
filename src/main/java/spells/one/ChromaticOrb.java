package spells.one;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ChromaticOrb extends Spell {

    public ChromaticOrb() {
        name = "Chromatic Orb";
        level = 1;
        school = Schools.EVOCATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a diamond worth at least 50gp";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(90);
        target = new Target(Aberbo);
        ritual = false;
        description = "You hurl a 4-inch-diameter sphere of energy at a creature that you can see within range. You choose acid, cold, fire, lightning, poison, or thunder for the type of orb you create, and then make a ranged spell attack against the target. If the attack hits, the creature takes 3d8 of the type you chose.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, the damage increases by 1d8 for each slot level above 1st.";
    }

}
