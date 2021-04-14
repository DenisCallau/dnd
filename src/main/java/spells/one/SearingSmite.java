package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class SearingSmite extends Spell {

    public SearingSmite() {
        name = "Searing Smite";
        level = 1;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "The next time you hit a creature wiht a melee weapon attack during the spell's duration, your " +
                "weapon flares with white-hot intensity, and the attack deals an extra 1d6 fire damage to the target " +
                "and causes the target to ignite in flames. At the start of each of its turns until the spell ends, " +
                "the target must make a Constitution saving throw. On a failed save, it takes 1d6 fire damage. On a " +
                "successful save, the spell ends. If the target or a creature within 5 feet of it uses an action to " +
                "put out the flames, or if some other effect douses the flames (such as the target being submerged in" +
                " water), the spell ends.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, the initial extra damage " +
                "dealt by the attack increases by 1d6 for each slot level above 1st.";
    }

}
