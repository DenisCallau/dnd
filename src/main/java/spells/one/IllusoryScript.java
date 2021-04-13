package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class IllusoryScript extends Spell {

    public IllusoryScript() {
        name = "Illusory Script";
        level = 1;
        school = Schools.ILLUSION;
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a lead-based ink worth at least 10gp, which this spell consumes";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = true;
        description = "You write on parchment, paper, or some other suitable writing material and imbue it with a " +
                "potent illusion that lasts for the duration.To you and any creatures you designate when you cast the" +
                " spell, the writing appears normal, written in your hand, and conveys whatever meaning you intended " +
                "when you wrote the text. To all others, the writing appears as if it were written in an unknown or " +
                "magical script that is unintelligible. Alternatively, you can cause the writing to appear to be an " +
                "entirely different message, written in a different hand and language, though the language must be " +
                "one you know.Should the spell be dispelled, the original script and the illusion both disappear.A " +
                "creature with truesight can read the hidden message.";
    }

}
