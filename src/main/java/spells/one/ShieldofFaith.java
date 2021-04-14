package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ShieldofFaith extends Spell {

    public ShieldofFaith() {
        name = "Shield of Faith";
        level = 1;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a small parchment with a bit of holy text written on it";
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(60);
        ritual = false;
        description = "A shimmering field appears and surrounds a creature of your choice within range, granting it a" +
                " +2 bonus to AC for the duration.";
    }

}
