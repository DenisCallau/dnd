package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ConjureElemental extends Spell {

    public ConjureElemental() {
        name = "Conjure Elemental";
        level = 5;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "burning incense for air, soft clay for earth, sulfur and phosphorus for fire, or water and sand " +
                "for water";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(90);
        target = new Target(Aberbo);
        ritual = false;
        description = "You call forth an elemental servant. Choose an area of air, earth, fire, or water that fills a" +
                " 10-foot cube within range. An elemental of challenge rating 5 or lower appropriate to the area you " +
                "chose appears in an unoccupied space within 10 feet of it. For example, a fire elemental emerges " +
                "from a bonfire, and an earth elemental rises up from the ground. The elemental disappears when it " +
                "drops to 0 hit points or when the spell ends.The elemental is friendly to you and your companions " +
                "for the duration. Roll initiative for the elemental, which has its own turns. It obeys any verbal " +
                "commands that you issue to it (no action required by you). If you don't issue any commands to the " +
                "elemental, it defends itself from hostile creatures but otherwise takes no actions.If your " +
                "concentration is broken, the elemental doesn't disappear. Instead, you lose control of the " +
                "elemental, it becomes hostile toward you and your companions, and it might attack. An uncontrolled " +
                "elemental can't be dismissed by you, and it disappears 1 hour after you summoned it.The DM has the " +
                "elemental's statistics.";
        higherLevels = "When you cast this spell using a spell slot of 6th level or higher, the challenge rating " +
                "increases by 1 for each slot level above 5th.";
    }

}
