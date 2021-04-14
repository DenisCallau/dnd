package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ElementalWeapon extends Spell {

    public ElementalWeapon() {
        name = "Elemental Weapon";
        level = 3;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(0);
        ritual = false;
        description = "A nonmagical weapon you touch becomes a magic weapon. Choose one of the following damage " +
                "types: acid, cold, fire, lightning, or thunder. For the duration, the weapon has a +1 bonus to " +
                "attack rolls and deals an extra 1d4 damage of the chosen type when it hits.";
        higherLevels = "When you cast this spell using a spell slot of 5th or 6th level, the bonus to attack rolls " +
                "increases to +2 and the extra damage increases to 2d4. When you use a spell slot of 7th level or " +
                "higher, the bonus increases to +3 and the extra damage increases to 3d4.";
    }

}
