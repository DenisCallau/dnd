package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Suggestion extends Spell {

    public Suggestion() {
        name = "Suggestion";
        level = 2;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.MATERIAL);
        material = "a snake's tongue and either a bit of honeycomb or a drop of sweet oil";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "You suggest a course of activity (limited to a sentence or two) and magically influence a " +
                "creature you can see within range that can hear and understand you. Creatures that can't be charmed " +
                "are immune to this effect. The suggestion must be worded in such a manner as to make the course of " +
                "action sound reasonable. Asking the creature to stab itself, throw itself onto a spear, immolate " +
                "itself, or do some other obviously harmful act ends the spell.The target must make a Wisdom saving " +
                "throw. On a failed save, it pursues the course of action you described to the best of its ability. " +
                "The suggested course of action can continue for the entire duration. If the suggested activity can " +
                "be completed in a shorter time, the spell ends when the subject finishes what it was asked to do.You" +
                " can also specify conditions that will trigger a special activity during the duration. For example, " +
                "you might suggest that a knight give her warhorse to the first beggar she meets. If the condition " +
                "isn't met before the spell expires, the activity isn't performed.If you or any of your companions " +
                "damage the target, the spell ends.";
    }

}
