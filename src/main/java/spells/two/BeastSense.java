package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class BeastSense extends Spell {

    public BeastSense() {
        name = "Beast Sense";
        level = 2;
        school = Schools.DIVINATION;
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = true;
        description = "You touch a willing beast. For the duration of the spell, you can use your action to see " +
                "through the beast’s eyes and hear what it hears, and continue to do so until you use your action to " +
                "return to your normal senses.While perceiving through the beast’s senses, you gain the benefits of " +
                "any special senses possessed by that creature, though you are blinded and deafened to your own " +
                "surroundings.";
    }

}
