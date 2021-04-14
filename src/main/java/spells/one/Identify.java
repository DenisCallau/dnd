package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Identify extends Spell {

    public Identify() {
        name = "Identify";
        level = 1;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a pearl worth at least 100 gp and an owl feather";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(0);
        ritual = true;
        description = "You choose one object that you must touch throughout the casting of the spell. If it is a " +
                "magic item or some other magic-imbued object, you learn its properties and how to use them, whether " +
                "it requires attunement to use, and how many charges it has, if any. You learn whether any spells are" +
                " affecting the item and what they are. If the item was created by a spell, you learn which spell " +
                "created it.If you instead touch a creature throughout the casting, you learn what spells, if any, " +
                "are currently affecting it.";
    }

}
