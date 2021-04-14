package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Darkvision extends Spell {

    public Darkvision() {
        name = "Darkvision";
        level = 2;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "either a pinch of dried carrot or an agate";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        ritual = false;
        description = "You touch a willing creature to grant it the ability to see in the dark. For the duration, " +
                "that creature has darkvision out to a range of 60 feet.";
    }

}
