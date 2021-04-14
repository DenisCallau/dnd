package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class DimensionDoor extends Spell {

    public DimensionDoor() {
        name = "Dimension Door";
        level = 4;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(500);
        ritual = false;
        description = "You teleport yourself from your current location to any other spot within range. You arrive at" +
                " exactly the spot desired. It can be a place you can see, one you can visualise, or one you can " +
                "describe by stating distance and direction, such as '200 feet straight downward' or 'upward to the " +
                "northwest at a 45-degree angle, 300 feet.'You can bring along objects as long as their weight " +
                "doesn't exceed what you can carry. You can also bring one willing creature of your size or smaller " +
                "who is carrying gear up to its carrying capacity. The creature must be within 5 feet of you when you" +
                " cast this spell.If you would arrive in a place already occupied by an object or a creature, you and" +
                " any creature travelling with you each take 4d6 force damage, and the spell fails to teleport you.";
    }

}
