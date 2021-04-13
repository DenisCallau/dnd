package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Sending extends Spell {

    public Sending() {
        name = "Sending";
        level = 3;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a short piece of fine copper wire";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(1, TimeUnits.ROUND);
//TODO: Check Range
        target = new Target(Aberbo);
        ritual = false;
        description = "You send a short message of twenty-five words or less to a creature with which you are " +
                "familiar. The creature hears the message in its mind, recognizes you as the sender if it knows you, " +
                "and can answer in a like manner immediately. The spell enables creatures with Intelligence scores of" +
                " at least 1 to understand the meaning of your message.You can send the message across any distance " +
                "and even to other planes of existence, but if the target is on a different plane than you, there is " +
                "a 5 percent chance that the message doesn’t arrive.";
    }

}
