package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class BestowCurse extends Spell {

    public BestowCurse() {
        name = "Bestow Curse";
        level = 3;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "* Choose one ability score. While cursed, the target has disadvantage on ability checks and " +
                "saving throws made with that ability score.* While cursed, the target has disadvantage on attack " +
                "rolls against you.* While cursed, the target must make a Wisdom saving throw at the start of each of" +
                " its turns. If it fails, it wastes its action that turn doing nothing.* While the target is cursed, " +
                "your attacks and spells deal an extra 1d8 necrotic damage to the target.A *[remove curse](." +
                "./remove-curse/ 'remove curse (lvl 3)')* spell ends this effect. At the DM’s option, you may choose " +
                "an alternative curse effect, but it should be no more powerful than those described above. The DM " +
                "has final say on such a curse’s effect.";
        higherLevels = "If you cast this spell using a spell slot of 4th level or higher, the duration is " +
                "concentration, up to 10 minutes. If you use a spell slot of 5th level or higher, the duration is 8 " +
                "hours. If you use a spell slot of 7th level or higher, the duration is 24 hours. If you use a 9th " +
                "level spell slot, the spell lasts until it is dispelled. Using a spell slot of 5th level or higher " +
                "grants a duration that doesn’t require concentration.";
    }

}
