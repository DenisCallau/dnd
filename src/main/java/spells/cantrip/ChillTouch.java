package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ChillTouch extends Spell {

    public ChillTouch() {
        name = "Chill Touch";
        level = 0;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(1, TimeUnits.ROUND);
        range = new Range(120);
        ritual = false;
        description = "You create a ghostly, skeletal hand in the space of a creature within range. Make a ranged " +
                "spell attack against the creature to assail it with the chill of the grave. On a hit, the target " +
                "takes 1d8 necrotic damage, and it can't regain hit points until the start of your next turn. Until " +
                "then, the hand clings to the target.If you hit an undead target, it also has disadvantage on attack " +
                "rolls against you until the end of your next turn.This spell's damage increases by 1d8 when you " +
                "reach 5th level (2d8), 11th level (3d8), and 17th level (4d8).";
    }

}
