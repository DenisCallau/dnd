package spells.seven;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Regenerate extends Spell {

    public Regenerate() {
        name = "Regenerate";
        level = 7;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a prayer wheel and holy water";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(0);
        ritual = false;
        description = "You touch a creature and stimulate its natural healing ability. The target regains 4d8 + 15 " +
                "hit points. For the duration of the spell, the target regains 1 hit point at the start of each of " +
                "its turns (10 hit points each minute).The target's severed body members (fingers, legs, tails, and " +
                "so on), if any, are restored after 2 minutes. If you have the severed part and hold it to the stump," +
                " the spell instantaneously causes the limb to knit to the stump.";
    }

}
