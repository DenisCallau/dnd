package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class LocateObject extends Spell {

    public LocateObject() {
        name = "Locate Object";
        level = 2;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a forked twig";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "Describe or name an object that is familiar to you. You sense the direction to the object's " +
                "location, as long as that object is within 1,000 feet of you. If the object is in motion, you know " +
                "the direction of its movement.The spell can locate a specific object known to you, as long as you " +
                "have seen it up close-—within 30 feet-—at least once. Alternatively, the spell can locate the " +
                "nearest object of a particular kind, such as a certain kind of apparel, jewelry, furniture, tool, or" +
                " weapon.This spell can't locate an object if any thickness of lead, even a thin sheet, blocks a " +
                "direct path between you and the object.";
    }

}
