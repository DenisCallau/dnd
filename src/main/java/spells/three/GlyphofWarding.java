package spells.three;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class GlyphofWarding extends Spell {

    public GlyphofWarding() {
        name = "Glyph of Warding";
        level = 3;
        school = Schools.ABJURATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "incense and powdered diamond worth at least 200 gp, which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.HOUR);
//TODO: CHECK DURATION
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "When you cast this spell, you inscribe a glyph that harms other creatures, either upon a surface (such as a table or a section of floor or wall) or within an object that can be closed (such as a book, a scroll, or a treasure chest) to conceal the glyph. If you choose a surface, the glyph can cover an area of the surface no larger than 10 feet in diameter. If you choose an object, that object must remain in its place; if the object is moved more than 10 feet from where you cast this spell, the glyph is broken, and the spell ends without being triggered.The glyph is nearly invisible and requires a successful Intelligence (Investigation) check against your spell save DC to be found.You decide what triggers the glyph when you cast the spell. For glyphs inscribed on a surface, the most typical triggers include touching or standing on the glyph, removing another object covering the glyph, approaching within a certain distance of the glyph, or manipulating the object on which the glyph is inscribed. For glyphs inscribed within an object, the most common triggers include opening that object, approaching within a certain distance of the object, or seeing or reading the glyph. Once a glyph is triggered, this spell ends.You can further refine the trigger so the spell activates only under certain circumstances or according to physical characteristics (such as height or weight), creature kind (for example, the ward could be set to affect aberrations or drow), or alignment. You can also set conditions for creatures that don�t trigger the glyph, such as those who say a certain password.When you inscribe the glyph, choose *explosive runes* or a *spell glyph*.";
        higherLevels = "When you cast this spell using a spell slot of 4th level or higher, the damage of an *explosive runes* glyph increases by 1d8 for each slot level above 3rd. If you create a *spell glyph*, you can store any spell of up to the same level as the slot you use for the *glyph of warding*.";
    }

}
