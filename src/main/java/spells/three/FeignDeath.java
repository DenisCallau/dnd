package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FeignDeath extends Spell {

    public FeignDeath() {
        name = "Feign Death";
        level = 3;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a pinch of graveyard dirt";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = true;
        description = "You touch a willing creature and put it into a cataleptic state that is indistinguishable from" +
                " death.For the spell’s duration, or until you use an action to touch the target and dismiss the " +
                "spell, the target appears dead to all outward inspection and to spells used to determine the " +
                "target’s status. The target is blinded and incapacitated, and its speed drops to 0. The target has " +
                "resistance to all damage except psychic damage. If the target is diseased or poisoned when you cast " +
                "the spell, or becomes diseased or poisoned while under the spell’s effect, the disease and poison " +
                "have no effect until the spell ends.";
    }

}
