package spells.one;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class InflictWounds extends Spell {

    public InflictWounds() {
        name = "Inflict Wounds";
        level = 1;
        school = Schools.NECROMANCY;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "Make a melee spell attack against a creature you canreach. On a hit, the target takes 3d10 necrotic damage.spell slot of 2nd level or higher, the damage increases by1d10 for each slot level above 1st.";
        higherLevels = "When you cast this spell using a";
    }

}
