package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class AuraofPurity extends Spell {

    public AuraofPurity() {
        name = "Aura of Purity";
        level = 4;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "Purifying energy radiates from you in an aura with a 30-foot radius. Until the spell ends, the" +
                " aura moves with you, centered on you. Each nonhostile creature in the aura (including you) can't " +
                "become diseased, has resistance to poison damage, and has advantage on saving throws against effects" +
                " that cause any of the following conditions: blinded, charmed, deafened, frightened, paralyzed, " +
                "poisoned, and stunned.";
    }

}
