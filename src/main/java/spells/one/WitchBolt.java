package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class WitchBolt extends Spell {

    public WitchBolt() {
        name = "Witch Bolt";
        level = 1;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a twig from a tree that has been struck by lightning";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "A beam of crackling, blue energy lances out toward a creature within range, forming a " +
                "sustained arc of lightning between you and the target. Make a ranged spell attack against that " +
                "creature. On a hit, the target takes 1d12 lightning damage, and on each of your turns for the " +
                "duration, you can use your action to deal 1d12 lightning damage to the target automatically. The " +
                "spell ends if you use your action to do anything else. The spell also ends if the target is ever " +
                "outside the spell's range or if it has total cover from you.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, the damage increases by " +
                "1d12 for each slot level above 1st.";
    }

}
