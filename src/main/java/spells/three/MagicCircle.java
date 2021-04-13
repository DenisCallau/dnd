package spells.three;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MagicCircle extends Spell {

    public MagicCircle() {
        name = "Magic Circle";
        level = 3;
        school = Schools.ABJURATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "holy water or powdered silver and iron worth at least 100 gp, which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(10);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create a 10-foot-radius, 20-foot-tall cylinder of magical energy centered on a point on the ground that you can see within range. Glowing runes appear wherever the cylinder intersects with the floor or other surface.* The creature can�t willingly enter the cylinder by nonmagical means. If the creature tries to use teleportation or interplanar travel to do so, it must first succeed on a Charisma saving throw.* The creature has disadvantage on attack rolls against targets within the cylinder.* Targets within the cylinder can�t be charmed, frightened, or possessed by the creature.When you cast this spell, you can elect to cause its magic to operate in the reverse direction, preventing a creature of the specified type from leaving the cylinder and protecting targets outside it.";
        higherLevels = "When you cast this spell using a spell slot of 4th level or higher, the duration increases by 1 hour for each slot level above 3rd.";
    }

}
