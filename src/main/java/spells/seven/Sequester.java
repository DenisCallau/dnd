package spells.seven;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Sequester extends Spell {

    public Sequester() {
        name = "Sequester";
        level = 7;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a powder of diamond, emerald, rube and sapphire dust worth at least 5,000 gp, which the spell " +
                "consumes";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        ritual = false;
        description = "By means of this spell, a willing creature or an object can be hidden away, safe from " +
                "detection for the duration. When you cast the spell and touch the target, it becomes invisible and " +
                "can't be targeted by divination spells or perceived through scrying sensors created by divination " +
                "spells.If the target is a creature, it falls into a state of suspended animation. Time ceases to " +
                "flow for it, and it doesn't grow older.You can set a condition for the spell to end early. The " +
                "condition can be anything you choose, but it must occur or be visible within 1 mile of the target.  " +
                "Examples include 'after 1,000 years' or 'when the tarrasque awakens.' This spell also ends if the " +
                "target takes any damage.";
    }

}
