package spells.three;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ConjureAnimals extends Spell {

    public ConjureAnimals() {
        name = "Conjure Animals";
        level = 3;
        school = Schools.CONJURATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "* One beast of challenge rating 2 or lower* Two beasts of challenge rating 1 or lower* Four beasts of challenge rating 1/2 or lower* Eight beasts of challenge rating 1/4 or lowerEach beast is also considered fey, and it disappears when it drops to 0 hit points or when the spell ends.The summoned creatures are friendly to you and your companions. Roll initiative for the summoned creatures as a group, which has its own turns. They obey any verbal commands that you issue to them (no action required by you). If you don�t issue any commands to them, they defend themselves from hostile creatures, but otherwise take no actions.The DM has the creatures� statistics.";
        higherLevels = "When you cast this spell using certain higher-level spell slots, you choose one of the summoning options above, and more creatures appear: twice as many with a 5th-level slot, three times as many with a 7th-level";
    }

}
