package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Levitate extends Spell {

    public Levitate() {
        name = "Levitate";
        level = 2;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "either a small leather loop or a pieee of golden wire bent into a cup shape with a long shank on " +
                "one end";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(60);
        ritual = false;
        description = "One creature or object of your choice that you can see within range rises vertically, up to 20" +
                " feet, and remains suspended there for the duration. The spell can levitate a target that weighs up " +
                "to 500 pounds. An unwilling creature that succeeds on a Constitution saving throw is unaffected.The " +
                "target can move only by pushing or pulling against a fixed object or surface within reach (such as a" +
                " wall or a ceiling), which allows it to move as if it were climbing. You can change the target's " +
                "altitude by up to 20 feet in either direction on your turn. If you are the target, you can move up " +
                "or down as part of your move. Otherwise, you can use your action to move the target, which must " +
                "remain within the spell's range.When the spell ends, the target floats gently to the ground if it is" +
                " still aloft.";
    }

}
