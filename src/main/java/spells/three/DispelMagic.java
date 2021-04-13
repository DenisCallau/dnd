package spells.three;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class DispelMagic extends Spell {

    public DispelMagic() {
        name = "Dispel Magic";
        level = 3;
        school = Schools.ABJURATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(120);
        target = new Target(Aberbo);
        ritual = false;
        description = "Choose one creature, object, or magical effect within range. Any spell of 3rd level or lower on the target ends. For each spell of 4th level or higher on the target, make an ability check using your spellcasting ability. The DC equals 10 + the spell�s level. On a successful check, the spell ends.";
        higherLevels = "When you cast this spell using a spell slot of 4th level or higher, you automatically end the effects of a spell on the target if the spell�s level is equal to or less than the level of the spell slot you used.";
    }

}
