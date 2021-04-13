package spells.six;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class WindWalk extends Spell {

    public WindWalk() {
        name = "Wind Walk";
        level = 6;
        school = Schools.TRANSMUTATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "fire and holy water";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "You and up to ten willing creatures you can see within range assume a gaseous form for the duration, appearing as wisps of cloud. While in this cloud form, a creature has a flying speed of 300 feet and has resistance to damage from nonmagical weapons. The only actions a creature can take in this form are the Dash action or to revert to its normal form. Reverting takes 1 minute, during which time a creature is incapacitated and can�t move. Until the spell ends, a creature can revert to cloud form, which also requires the 1-minute transformation.If a creature is in cloud form and flying when the effect ends, the creature descends 60 feet per round for 1 minute until it lands, which it does safely. If it can�t land after 1 minute, the creature falls the remaining distance.";
    }

}
