package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class PlanarBinding extends Spell {

    public PlanarBinding() {
        name = "Planar Binding";
        level = 5;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a jewel worth at least 1,000 gp, which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.HOUR);
//TODO: CHECK DURATION
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "With this spell, you attempt to bind a celestial, an elemental, a fey, or a fiend to your " +
                "service. The creature must be within range for the entire casting of the spell. (Typically, the " +
                "creature is first summoned into the center of an inverted magic circle in order to keep it trapped " +
                "while this spell is cast.) At the completion of the casting, the target must make a Charisma saving " +
                "throw. On a failed save, it is bound to serve you for the duration. If the creature was summoned or " +
                "created by another spell, that spell's duration is extended to match the duration of this spell.A " +
                "bound creature must follow your instructions to the best of its ability. You might command the " +
                "creature to accompany you on an adventure, to guard a location, or to deliver a message. The " +
                "creature obeys the letter of your instructions, but if the creature is hostile to you, it strives to" +
                " twist your words to achieve its own objectives. If the creature carries out your instructions " +
                "completely before the spell ends, it travels to you to report this fact if you are on the same plane" +
                " of existence. If you are on a different plane of existence, it returns to the place where you bound" +
                " it and remains there until the spell ends.";
        higherLevels = "When you cast this spell using a spell slot of a higher level, the duration increases to 10 " +
                "days with a 6th-level slot, to 30 days with a 7th-level slot, to 180 days with an 8th-level slot, " +
                "and to a year and a day with a 9th-level spell slot.";
    }

}
