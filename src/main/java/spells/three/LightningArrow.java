package spells.three;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class LightningArrow extends Spell {

    public LightningArrow() {
        name = "Lightning Arrow";
        level = 3;
        school = Schools.TRANSMUTATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "The next time you make a ranged w eapon attack during the spell�s duration, the weapon�s ammunition, or the weapon itself if it�s a thrown weapon, transforms into a bolt of lightning. Make the attack roll as normal. The target takes 4d8 lightning damage on a hit, or half as much damage on a miss, instead of the weapon�s normal damage.Whether you hit or miss, each creature within 10 feet of the target must make a Dexterity saving throw. Each of these creatures takes 2d8 lightning damage on a failed save, or half as much damage on a successful one.The piece of ammunition or weapon then returns to its normal form.";
        higherLevels = "When you cast this spell using a spell slot of 4th level or higher, the damage for both effects of the spell increases by 1d8 for each slot level above 3rd.";
    }

}
