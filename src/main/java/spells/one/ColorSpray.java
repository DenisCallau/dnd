package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ColorSpray extends Spell {

    public ColorSpray() {
        name = "Color Spray";
        level = 1;
        school = Schools.ILLUSION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a pinch of powder or sand that is colored red, yellow, and blue";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(1, TimeUnits.ROUND);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "A dazzling array of flashing, colored light springs from your hand. Roll 6d10; the total is " +
                "how many hit points of creatures this spell can effect. Creatures in a 15-foot cone originating from" +
                " you are affected in ascending order of their current hit points (ignoring unconscious creatures and" +
                " creatures that can't see).Starting with the creature that has the lowest current hit points, each " +
                "creature affected by this spell is blinded until the spell ends. Subtract each creature's hit points" +
                " from the total before moving on to the creature with the next lowest hit points. A creature's hit " +
                "points must be equal to or less than the remaining total for that creature to be affected.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, roll an additional 2d10 " +
                "for each slot level above 1st.";
    }

}
