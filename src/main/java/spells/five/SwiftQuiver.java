package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class SwiftQuiver extends Spell {

    public SwiftQuiver() {
        name = "Swift Quiver";
        level = 5;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a quiver containing at least one piece of ammunition";
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(0);
        ritual = false;
        description = "You transmute your quiver so it produces an endless supply of nonmagical ammunition, which " +
                "seems to leap into your hand when you reach for it.On each of your turns until the spell ends, you " +
                "can use a bonus action to make two attacks with a weapon that uses ammunition from the quiver. Each " +
                "time you make such a ranged attack, your quiver magically replaces the piece of ammunition you used " +
                "with a similar piece of nonmagical ammunition. Any pieces of ammunition created by this spell " +
                "disintegrate when the spell ends. If the quiver leaves your possession, the spell ends.";
    }

}
