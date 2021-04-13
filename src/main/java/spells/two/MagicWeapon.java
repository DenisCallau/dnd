package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MagicWeapon extends Spell {

    public MagicWeapon() {
        name = "Magic Weapon";
        level = 2;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You touch a nonmagical weapon. Until the spell ends, that weapon becomes a magic weapon with a" +
                " +1 bonus to attack rolls and damage rolls.";
        higherLevels = "When you cast this spell using a spell slot of 4th level or higher, the bonus increases to +2" +
                ". When you use a spell slot of 6th level or higher, the bonus increases to +3.";
    }

}
