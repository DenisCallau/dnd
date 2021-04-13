package spells.six;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class WordofRecall extends Spell {

    public WordofRecall() {
        name = "Word of Recall";
        level = 6;
        school = Schools.CONJURATION;
        components = new Components[]{
                Components.VERBAL,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(5);
        target = new Target(Aberbo);
        ritual = false;
        description = "You and up to five willing creatures within 5 feet of you instantly teleport to a previously designated sanctuary. You and any creatures that teleport with you appear in the nearest unoccupied space to the spot you designated when you prepared your sanctuary (see below). If you cast this spell without first preparing a sanctuary, the spell has no effect.You must designate a sanctuary by casting this spell within a location, such as a temple, dedicated to or strongly linked to your deity. If you attempt to cast the spell in this manner in an area that isn�t dedicated to your deity, the spell has no effect.";
    }

}
