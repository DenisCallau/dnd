package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FreedomofMovement extends Spell {

    public FreedomofMovement() {
        name = "Freedom of Movement";
        level = 4;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a leather strap, bound around the arm or a similar appendage";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You touch a willing creature. For the duration, the target's movement is unaffected by " +
                "difficult terrain, and spells and other magical effects can neither reduce the target's speed nor " +
                "cause the target to be paralyzed or restrained.The target can also spend 5 feet of movement to " +
                "automatically escape from nonmagical restraints, such as manacles or a creature that has it grappled" +
                ". Finally, being underwater imposes no penalties on the target's movement or attacks.";
    }

}
