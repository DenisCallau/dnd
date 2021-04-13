package spells.one;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class DivineFavor extends Spell {

    public DivineFavor() {
        name = "Divine Favor";
        level = 1;
        school = Schools.EVOCATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "Your prayer empowers you with divine radiance. Until the spell ends, your weapon attacks deal an extra 1d4 radiant damage on a hit.";
    }

}