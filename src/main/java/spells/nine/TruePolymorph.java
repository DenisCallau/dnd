package spells.nine;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class TruePolymorph extends Spell {

    public TruePolymorph() {
        name = "True Polymorph";
        level = 9;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a drop of mercury, a dollop of gum arabic, and a wisp of smoke";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "Choose one creature or nonmagical object that you can see within range. You transform the " +
                "creature into a different creature, the creature into an object or the object into a creature (the " +
                "object must be neither worn nor carried by another creature). The transformation lasts for the " +
                "duration, or until the target drops to 0 hit points or dies. If you concentrate on this spell for " +
                "the full duration, the transformation becomes permanent.Shapechangers aren't affected by this spell." +
                " An unwilling creature can make a Wisdom saving throw, and if it succeeds, it isn't affected by this" +
                " spell.The target assumes the hit points of its new form, and when it reverts to its normal form, " +
                "the creature returns to the number of hit points it had before it transformed. If it reverts as a " +
                "result of dropping to 0 hit points, any excess damage carries over to its normal form. As long as " +
                "the excess damage doesn't reduce the creature's normal form to 0 hit points, it isn't knocked " +
                "unconscious.The creature is limited in the actions it can perform by the nature of its new form, and" +
                " it can't speak, cast spells, or take any other action that requires hands or speech, unless its new" +
                " form is capable of such actions.The target's gear melds into the new form. The creature can't " +
                "activate, use, wield, or otherwise benefit from any of its equipment.If the spell becomes permanent," +
                " you no longer control the creature. It might remain friendly to you, depending on how you have " +
                "treated it.";
    }

}
