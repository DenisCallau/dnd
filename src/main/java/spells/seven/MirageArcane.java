package spells.seven;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MirageArcane extends Spell {

    public MirageArcane() {
        name = "Mirage Arcane";
        level = 7;
        school = Schools.ILLUSION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(10, TimeUnits.MINUTE);
//TODO: CHECK DURATION
//TODO: Check Range
        target = new Target(Aberbo);
        ritual = false;
        description = "You make terrain in a area up to 1 mile square look, sound, smell, and even feel like some other sort of terrain. The terrain's general shape remains the same, however. Open fields or a road could be made to resemble a swamp, hill, crevasse, or some other difficult or impassable terrain. A pond can be made to seem like a grassy meadow, a precipice like a gental slope, or a rock-strewn gully like a wide and smooth road.Similarly, you can alter the appearance of structures, and add them where none are present. The spell doesn't disguise, conceal or add creatures.The illusion includes audible, visual, tactile, and olfactory elements, so it can turn clear ground into difficult terrain (or vice versa) or otherwise impede movement through the area. Any piece of the illusory terrain (such as a rock or stick) that is removed from the spell's area disappears immediately.Creatures with truesight can see through the illusion to the terrain's true form; however, all other elements of the illusion remain, so while the creature is aware of the illusion's presence, the creature can still physically interact with the illusion.";
    }

}
