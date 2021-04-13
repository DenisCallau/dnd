package spells.four;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ConjureWoodlandBeings extends Spell {

    public ConjureWoodlandBeings() {
        name = "Conjure Woodland Beings";
        level = 4;
        school = Schools.CONJURATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "one holly berry per creature summoned";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "* One fey creature of challenge rating 2 or lower* Two fey creatures of challenge rating 1 or lower* Four fey creatures of challenge rating 1/2 or lower* Eight fey creatures of challenge rating 1/4 or lowerA summoned creature disappears when it drops to 0 hit points or when the spell ends.The summoned creatures are friendly to you and your companions. Roll initiative for the summoned creatures as a group, which have their own turns. They obey any verbal commands that you issue to them (no action required by you). If you don't issue any commands to them, they defend themselves from hostile creatures, but otherwise take no actions.The DM has the creatures' statistics.";
        higherLevels = "When you cast this spell using certain higher-level spell slots, you choose one of the summoning options above, and more creatures appear: twice as many with a 6th-level slot and three times as many with an 8th-level slot.";
    }

}
