package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ArcaneEye extends Spell {

    public ArcaneEye() {
        name = "Arcane Eye";
        level = 4;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a bit of bat fur";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(30);
        ritual = false;
        description = "You create an invisible, magical eye within range that hovers in the for the duration.You " +
                "mentally recieve visual information from the eye, which has normal vision and darkvision out to 30 " +
                "feet. The eye can look in every direction.As an action, you can move the eye up to 30 feet in any " +
                "direction. There is no limit to how far away from you the eye can move, but it can't enter another " +
                "plane of existence. A solid barrier blocks the eye's movement, but the eye can pass through an " +
                "opening as small as 1 inch in diameter.";
    }

}
