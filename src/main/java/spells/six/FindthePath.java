package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FindthePath extends Spell {

    public FindthePath() {
        name = "Find the Path";
        level = 6;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a set of divinatory tools -- such as bones, ivory sticks, cards, teeth, or carved runes -- worth " +
                "100 gp and an object from the location you wish to find";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
        duration = new Duration(true, 1, TimeUnits.DAY);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "This spell allows you to find the shortest, most direct physical route to a specific fixed " +
                "location that you are familiar with on the same plane of existence. If you name a destination on " +
                "another plan of existence, a destination that moves (such as a mobile fortress), or a destination " +
                "that isn't specific (such as 'a green dragon's lair'), the spell fails.For the duration, as long as " +
                "you are on the same plane of existence as the destination, you know how far it is and in what " +
                "direction it lies. While you are traveling there, whenever you are presented with a choice of paths " +
                "along the way, you atomatically determine which path is the shortest and most direct route (but not " +
                "necessarily the safest route) to the destination.";
    }

}
