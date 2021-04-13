package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class GraspingVine extends Spell {

    public GraspingVine() {
        name = "Grasping Vine";
        level = 4;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "You conjure a vine that sprouts from the ground in an unoccupied space of your choice that you" +
                " can see within range. When you cast this spell, you can direct the vine to lash out at a creature " +
                "within 30 feet of it that you can see. That creature must succeed on a Dexterity saving throw or be " +
                "pulled 20 feet directly toward the vine.Until the spell ends, you can direct the vine to lash out at" +
                " the same creature or another one as a bonus action on each of your turns.";
    }

}
