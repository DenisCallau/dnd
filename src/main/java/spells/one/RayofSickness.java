package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class RayofSickness extends Spell {

    public RayofSickness() {
        name = "Ray of Sickness";
        level = 1;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        ritual = false;
        description = "A ray of sickening greenish energy lashes out toward a creature within range. Make a ranged " +
                "spell attack against the target. On a hit, the target takes 2d8 poison damage and must make a " +
                "Constitution saving throw. On a failed save, it is also poisoned until the end of your next turn.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, the damage increases by " +
                "1d8 for each slot level above 1st.";
    }

}
