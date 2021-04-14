package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Thaumaturgy extends Spell {

    public Thaumaturgy() {
        name = "Thaumaturgy";
        level = 0;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(30);
        ritual = false;
        description = "* Your voice booms up to three times as loud as normal for 1 minute.* You cause flames to " +
                "flicker, brighten, dim, or change color for 1 minute.* You cause harmless tremors in the ground for " +
                "1 minute.* You create an instantaneous sound that originates from a point of your choice within " +
                "range, such as a rumble of thunder, the cry of a raven, or ominous whispers.* You instantaneously " +
                "cause an unlocked door or window to fly open or slam shut.* You alter the appearance of your eyes " +
                "for 1 minute.If you cast this spell multiple times, you can have up to three of its 1-minute effects" +
                " active at a time, and you can dismiss such an effect as an action.";
    }

}
