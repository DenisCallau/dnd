package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FireShield extends Spell {

    public FireShield() {
        name = "Fire Shield";
        level = 4;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a bit of phosphorous or a firefly";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "Thin and wispy flames wreathe your body for the duration, shedding bright light in a 10-foot " +
                "radius and dim light for an additional 10 feet, You can end the spell early by using an action to " +
                "dismiss it.The flames provide you with a warm shield or a chill shield, as you choose. The warm " +
                "shield grants you resistance to cold damage, and the chill shield grants you resistance to fire " +
                "damage.In addition, whenever a creature within 5 feet of you hits you with a melee attack, the " +
                "shield erupts with flame. The attacker takes 2d8 fire damage from a warm shield, or 2d8 cold damage " +
                "from a cold shield.";
    }

}
