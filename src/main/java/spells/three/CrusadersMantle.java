package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class CrusadersMantle extends Spell {

    public CrusadersMantle() {
        name = "Crusader's Mantle";
        level = 3;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "Holy power radiates from you in an aura with a 30-foot radius, awakening boldness in friendly " +
                "creatures. Until the spell ends, the aura moves with you, centered on you. While in the aura, each " +
                "nonhostile creature in the aura (including you) deals an extra 1d4 radiant damage when it hits with " +
                "a weapon attack.";
    }

}
