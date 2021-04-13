package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class AuraOfVitality extends Spell {

    public AuraOfVitality() {
        name = "Aura Of Vitality";
        level = 3;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "Healing energy radiates from you in an aura with a 30-foot radius. Until the spell ends, the " +
                "aura moves with you, centered on you. You can use a bonus action to cause one creature in the aura " +
                "(including you) to regain 2d6 hit points.";
    }

}
