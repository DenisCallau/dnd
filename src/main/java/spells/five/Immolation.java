package spells.five;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Immolation extends Spell {

    public Immolation() {
        name = "Immolation";
        level = 5;
        school = Schools.EVOCATION;
        components = new Components[]{
                Components.VERBAL,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(90);
        target = new Target(Aberbo);
        ritual = false;
        description = "Flames wreathe one creature you can see within range. The target must make a Dexterity saving throw. It takes 7d6 fire damage on a failed save, or half as much damage on a successful one. On a failed save, the target also burns for the spell�s duration. The burning target sheds bright light in a 30-foot radius and dim light for an additional 30 feet. At the end of each of its turns, the target repeats the saving throw. It takes 3d6 fire damage on a failed save, and the spell ends on a successful one. These magical flames can�t be extinguished through nonmagical means.If damage from this spell reduces a target to 0 hit points, the target is turned to ash.";
    }

}
