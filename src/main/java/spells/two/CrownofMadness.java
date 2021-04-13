package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class CrownofMadness extends Spell {

    public CrownofMadness() {
        name = "Crown of Madness";
        level = 2;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(120);
        target = new Target(Aberbo);
        ritual = false;
        description = "One humanoid of your choice that you can see within range must succeed on a Wisdom saving " +
                "throw or become charmed by you for the duration. While the target is charmed in this way, a twisted " +
                "crown of jagged iron appears on its head, and a madness glows in its eyes. The charmed target must " +
                "use its action before moving on each of its turns to make a melee attack against a creature other " +
                "than itself that you mentally choose.";
    }

}
