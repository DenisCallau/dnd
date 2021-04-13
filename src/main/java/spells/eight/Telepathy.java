package spells.eight;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Telepathy extends Spell {

    public Telepathy() {
        name = "Telepathy";
        level = 8;
        school = Schools.EVOCATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a pair of linked silver rings";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
//TODO: Check Range
        target = new Target(Aberbo);
        ritual = false;
        description = "You create a telepathic link between yourself and a willing creature with which you are familiar. The creature can be anywhere on the same plane of existence as you. The spell ends if you or the target are no longer on the same plane.Until the spell ends, you and the target can instantaneously share words, images, sounds and other sensory messages with one another through the link, and the target recognizes you as the creature it is communicating with. The spell enables a creature with an Intelligence score of at least 1 to understand the meaning of your words and take in the scope of any sensory messages you send to it.";
    }

}
