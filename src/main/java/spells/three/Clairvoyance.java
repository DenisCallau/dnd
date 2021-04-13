package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Clairvoyance extends Spell {

    public Clairvoyance() {
        name = "Clairvoyance";
        level = 3;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a focus worth at least 100gp, either a jeweled horn for hearing or a glass eye for seeing";
        castingTime = new CastingTime(10, TimeUnits.MINUTE);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(mile, DistanceUnits.MILE);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create an invisible sensor within range in a location familiar to you (a place you have " +
                "visited or seen before) or in an obvious location that is unfamiliar to you (such as behind a door, " +
                "around a corner, or in a grove of trees). The sensor remains in place for the duration, and it can’t" +
                " be attacked or otherwise interacted with.When you cast the spell, you choose seeing or hearing. You" +
                " can use the chosen sense through the sensor as if you were in its space. As your action, you can " +
                "switch between seeing and hearing.A creature that can see the sensor (such as a creature benefiting " +
                "from *[see invisibility](../see-invisibility/ 'see invisibility (lvl 2)')* or truesight) sees a " +
                "luminous, intangible orb about the size of your fist.";
    }

}
