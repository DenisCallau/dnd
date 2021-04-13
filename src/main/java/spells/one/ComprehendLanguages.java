package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ComprehendLanguages extends Spell {

    public ComprehendLanguages() {
        name = "Comprehend Languages";
        level = 1;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a pinch of soot and salt";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = true;
        description = "For the duration, you understand the literal meaning of any spoken language that you hear. You" +
                " also understand any written language that you see, but you must be touching the surface on which " +
                "the words are written. It takes about 1 minute to read one page of text.This spell doesn’t decode " +
                "secret messages in a text or a glyph, such as an arcane sigil, that isn’t part of a written language.";
    }

}
