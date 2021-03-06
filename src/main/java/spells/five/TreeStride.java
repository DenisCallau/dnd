package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class TreeStride extends Spell {

    public TreeStride() {
        name = "Tree Stride";
        level = 5;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "You gain the ability to enter a tree and move from inside it to inside another tree of the " +
                "same kind within 500 feet. Both trees must be living and at least the same size as you. You must use" +
                " 5 feet of movement to enter a tree. You instantly know the location of all other trees of the same " +
                "kind within 500 feet and, as part of the move used to enter the tree, can either pass into one of " +
                "those trees or step out of the tree you're in. You appear in a spot of your choice within 5 feet of " +
                "the destination tree, using another 5 feet of movement. If you have no movement left, you appear " +
                "within 5 feet of the tree you entered.You can use this transportation ability once per round for the" +
                " duration. You must end each turn outside a tree.";
    }

}
