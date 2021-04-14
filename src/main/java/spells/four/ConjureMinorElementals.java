package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ConjureMinorElementals extends Spell {

    public ConjureMinorElementals() {
        name = "Conjure Minor Elementals";
        level = 4;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(90);
        ritual = false;
        description = "* One elemental of challenge rating 2 or lower* Two elementals of challenge rating 1 or lower*" +
                " Four elementals of challenge rating 1/2 or lower* Eight elementals of challenge rating 1/4 or lower" +
                ".An elemental summoned by this spell disappears when it drops to 0 hit points or when the spell ends" +
                ".The summoned creatures are friendly to you and your companions. Roll initiative for the summoned " +
                "creatures as a group, which has its own turns. They obey any verbal commands that you issue to them " +
                "(no action required by you). If you don't issue any commands to them, they defend themselves from " +
                "hostile creatures, but otherwise take no actions.The DM has the creatures' statistics.";
        higherLevels = "When you cast this spell using certain higher-level slots, you choose one of the summoning " +
                "options above, and more creatures appear: twice as many with a 6th-level slot and three times as " +
                "many with an 8th-level slot.";
    }

}
