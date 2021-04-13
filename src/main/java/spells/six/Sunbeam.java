package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Sunbeam extends Spell {

    public Sunbeam() {
        name = "Sunbeam";
        level = 6;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a magnifying glass";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "A beam of brilliant light flashes out from your hand in a 5-foot-wide, 60-foot-long line. Each" +
                " creature in the line must make a Constitution saving throw. On a failed save, a creature takes 6d8 " +
                "radiant damage and is blinded until your next turn. On a successful save, it takes half as much " +
                "damage and isn't blinded by this spell. Undead and oozes have disadvantage on this saving throw.You " +
                "can create a new line of radiance as your action on any turn until the spell ends.For the duration, " +
                "a mote of brilliant radiance shines in your hand. It sheds bright light in a 30-foot radius and dim " +
                "light for an additional 30 feet. This light is sunlight.";
    }

}
