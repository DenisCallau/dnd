package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Creation extends Spell {

    public Creation() {
        name = "Creation";
        level = 5;
        school = Schools.ILLUSION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a tiny piece of matter of the same type of the item you plan to create";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
//TODO: Check duration
//TODO: CHECK DURATION
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "The duration depends on the object's material. If the object is composed of multiple " +
                "materials, use the shortest duration.| Material              | Duration   ||---|---|| Vegetable " +
                "matter      | 1 day      || Stone or crystal      | 12 hours   || Precious metals       | 1 hour    " +
                " || Gems                  | 10 minutes || Adamantine or mithral | 1 minute   |Using any material " +
                "created by this spell as another spell's material component causes that spell to fail.";
        higherLevels = "When you cast this spell using a spell slot of 6th level or higher, the cube increases by 5 " +
                "feet for each slot level above 5th.";
    }

}
