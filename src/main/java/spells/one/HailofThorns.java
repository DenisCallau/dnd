package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class HailofThorns extends Spell {

    public HailofThorns() {
        name = "Hail of Thorns";
        level = 1;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "The next time you hit a creature with a ranged weapon attack before this spell ends, this " +
                "spell creates a rain of thorns that sprouts from your ranged weapon or ammunition. In addition to " +
                "the normal effects of the attack, the target of the attack and each creature within 5 feet of it " +
                "must make a Dexterity saving throw. A creature takes 1d10 piercing damage on a failed save, or half " +
                "as much damage on a successful one.";
        higherLevels = "If you cast this spell using a spell slot of 2nd level or higher, the damage increases by " +
                "1d10 for each slot level above 1st (to a maximum of 6d10).";
    }

}
