package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class BrandingSmite extends Spell {

    public BrandingSmite() {
        name = "Branding Smite";
        level = 2;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "The next time you hit a creature with a weapon attack before this spell ends, the weapon " +
                "gleams with astral radiance as you strike. The attack deals an extra 2d6 radiant damage to the " +
                "target, which becomes visible if it’s invisible, and the target sheds dim light in a 5-foot radius " +
                "and can’t become invisible until the spell ends.";
        higherLevels = "When you cast this spell using a spell slot of 3rd level or higher, the extra damage " +
                "increases by 1d6 for each slot level above 2nd.";
    }

}
