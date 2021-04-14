package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Grease extends Spell {

    public Grease() {
        name = "Grease";
        level = 1;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a bit of pork rind or butter";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(60);
        ritual = false;
        description = "Slick grease covers the ground in a 10-foot square centered on a point within range and turns " +
                "it into difficult terrain for the duration.When the grease appears, each creature standing in its " +
                "area must succeed on a Dexterity saving throw or fall prone. A creature that enters the area or ends" +
                " its turn there must also succeed on a Dexterity saving throw or fall prone.";
    }

}
