package spells.two;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class WardingBond extends Spell {

    public WardingBond() {
        name = "Warding Bond";
        level = 2;
        school = Schools.ABJURATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a pair of platinum rings worth at least 50 gp each, which you and the target must wear for the duration";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "This spell wards a willing creature you touch and creates a mystic connection between you and the target until the spell ends. While the target is within 60 feet of you, it gains a +1 bonus to AC and saving throws, and it has resistance to all damage. Also, each time it takes damage, you take the same amount of damage.The spell ends if you drop to 0 hit points or if you and the  target become separated by more than 60 feet. It also ends if the spell is cast again on either of the connected creatures. You can also dismiss the spell as an action.";
    }

}