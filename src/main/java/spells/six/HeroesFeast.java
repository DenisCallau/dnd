package spells.six;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class HeroesFeast extends Spell {

    public HeroesFeast() {
        name = "Heroe's Feast";
        level = 6;
        school = Schools.CONJURATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a gem-encrusted bowl worth at least 1,000 gp, which the spell consumes";
        castingTime = new CastingTime(10, TimeUnits.MINUTE);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "You bring forth a great feast, including magnificent food and drink. The feast takes 1 hour to consume and disappears at the end of that time, and the beneficial effects don�t set in until this hour is over. Up to twelve other creatures can partake of the feast.A creature that partakes of the feast gains several benefits. The creature is cured of all diseases and poison, becomes immune to poison and being frightened, and makes all Wisdom saving throws with advantage. Its hit point maximum also increases by 2d10, and it gains the same number of hit points. These benefits last for 24 hours";
    }

}
