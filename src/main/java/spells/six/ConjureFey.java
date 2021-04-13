package spells.six;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ConjureFey extends Spell {

    public ConjureFey() {
        name = "Conjure Fey";
        level = 6;
        school = Schools.CONJURATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(90);
        target = new Target(Aberbo);
        ritual = false;
        description = "You summon a fey creature of challenge rating 6 or lower, or a fey spirit that takes the form of a beast of challenge rating 6 or lower. It appears in an unoccupied space that you can see within range. The fey creature disappears when it drops to 0 hit points or when the spell ends.The fey creature is friendly to you and your companions for the duration. Roll initiative for the creature, which has its own turns. It obeys any verbal commands that you issue to it (no action required by you), as long as they don't violate its alignment. If you don't issue any commands to the fey creature, it defends itself from hostile creatures but otherwise takes no actions.If your concentration is broken, the fey creature doesn't disappear. Instead, you lose control of the fey creature, it becom es hostile toward you and your companions, and it might attack. An uncontrolled fey creature can't be dismissed by you, and it disappears 1 hour after you summoned it.The DM has the fey creature's statistics.";
        higherLevels = "When you cast this spell using a spell slot of 7th level or higher, the challenge rating increases by 1 for each slot level above 6th.";
    }

}
