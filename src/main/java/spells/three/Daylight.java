package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Daylight extends Spell {

    public Daylight() {
        name = "Daylight";
        level = 3;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "A 60-foot-radius sphere of light spreads out from a point you choose within range. The sphere " +
                "is bright light and sheds dim light for an additional 60 feet.If you chose a point on an object you " +
                "are holding or one that isn’t being worn or carried, the light shines from the object and moves with" +
                " it. Completely covering the affected object with an opaque object, such as a bowl or a helm, blocks" +
                " the light.If any of this spell’s area overlaps with an area of darkness created by a spell of 3rd " +
                "level or lower, the spell that created the darkness is dispelled.";
    }

}
