package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class BeastBond extends Spell {

    public BeastBond() {
        name = "Beast Bond";
        level = 1;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a bit of fur wrapped in a cloth";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You establish a telepathic link with one beast you touch that is friendly to you or charmed by" +
                " you. The spell fails if the beast’s Intelligence is 4 or higher. Until the spell ends, the link is " +
                "active while you and the beast are within line of sight of each other. Through the link, the beast " +
                "can understand your telepathic messages to it, and it can telepathically communicate simple emotions" +
                " and concepts back to you. While the link is active, the beast gains advantage on attack rolls " +
                "against any creature within 5 feet of you that you can see.";
    }

}
