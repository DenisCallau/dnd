package spells.seven;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class PrismaticSpray extends Spell {

    public PrismaticSpray() {
        name = "Prismatic Spray";
        level = 7;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "Eight multicolored rays of light flash from your hand. Each ray is a different color and has a" +
                " different power and purpose. Each creature in a 60-foot code must make a Dexterity saving throw. " +
                "For each target, roll a d8 to determine which color ray affects it.";
    }

}
