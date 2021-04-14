package spells.eight;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MindBlank extends Spell {

    public MindBlank() {
        name = "Mind Blank";
        level = 8;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        ritual = false;
        description = "Until the spell ends, one willing creature you touch is immune to psychic damage, any effect " +
                "that would sense its emotions or read its thoughts, divination spells, and the charmed condition. " +
                "The spell even foils _[wish](../wish/ 'wish (lvl 9)')_ spells and spells or effects of similar power" +
                " used to affect the target's mind or to gain information about the target.";
    }

}
