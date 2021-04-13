package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FaerieFire extends Spell {

    public FaerieFire() {
        name = "Faerie Fire";
        level = 1;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "Each object in a 20-foot cube within range is outlined in blue, green, or violet light (your " +
                "choice). Any creature in the area when the spell is cast is also outlined in light if it fails a " +
                "Dexterity saving throw. For the duration, objects and affected creatures shed dim light in a 10-foot" +
                " radius.Any attack roll against an affected creature or object has advantage if the attacker can see" +
                " it, and the affected creature or object can't benefit from being invisible.";
    }

}
