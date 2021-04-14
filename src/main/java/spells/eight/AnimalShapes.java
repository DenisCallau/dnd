package spells.eight;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class AnimalShapes extends Spell {

    public AnimalShapes() {
        name = "Animal Shapes";
        level = 8;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(30);
        ritual = false;
        description = "Your magic turns others into beasts. Choose any number of willing creatures that you can see " +
                "within range. You transform each target into the form of a Large or smaller beast with a challenge " +
                "rationg of 4 or lower.  On subsequent turns, you can use your action to transform affected creatures" +
                " into new forms.The transformation lasts for the duration for each target, or until the target drops" +
                " to 0 hit points or dies.  You can choose a different form for each target. A target's game " +
                "statistics are replaced by the statistics of the chosen beast, thought the target retains its " +
                "alignment and Intelligence, Wisdom, and Charisma scores. The target assumes the hit points of its " +
                "new form, and when it reverts to its normal form, it returns to the number of hit points it had " +
                "before it transformed. If it reverts as a result of dropping to 0 hit points, any excess damage " +
                "carries over to its normal form. As long as the excess damage doesn't reduce the creature's normal " +
                "form to 0 hit points, it isn't knocked unconscious. The creature is limited in the actions it can " +
                "perform by the nature of its new form, and it can't speak or cast spells.The target's gear melds " +
                "into the new form. The target can't activate, wield, or otherwise benefit from any of its equipment.";
    }

}
