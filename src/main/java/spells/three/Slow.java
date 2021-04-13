package spells.three;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Slow extends Spell {

    public Slow() {
        name = "Slow";
        level = 3;
        school = Schools.TRANSMUTATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a drop of molasses";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(120);
        target = new Target(Aberbo);
        ritual = false;
        description = "You alter time around up to six creatures of your choice in a 40-foot cube within range. Each target must succeed on a wisdom saving throwor be affected by this spell for the duration.An affected target�s speed is halved, it takes a -2 penalty to AC and Dexterity saving throws, and it can�t use reactions. On its turn, it can use either an action or a bonus action, not both. Regardless of the creature�s abilities or magic items, it can�t make more than one melee or ranged attack during its turn.If the creature attempts to cast a spell with a casting time of 1 action, roll a d20. On an 11 or higher, the spell doesn�t take effect until the creature�s next turn, and the creature must use its action on that turn to complete the spell. If it can�t, the spell is wasted.A creature affected by this spell makes another Wisdom saving throwat the end of its turn. On a successful save, the effect ends for it.";
    }

}
