package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ElementalBane extends Spell {

    public ElementalBane() {
        name = "Elemental Bane";
        level = 4;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(90);
        ritual = false;
        description = "Choose one creature you can see within range, and choose one of the following damage types: " +
                "acid, cold, fire, lightning, or thunder. The target must succeed on a Constitution saving throw or " +
                "be affected by the spell for its duration. The first time each turn the affected target takes damage" +
                " of the chosen type, the target takes an extra 2d6 damage of that type. Moreover, the target loses " +
                "any resistance to that damage type until the spell ends.";
        higherLevels = "When you cast this spell using a spell slot of 5th level or higher, you can target one " +
                "additional creature for each slot level above 4th. The creatures must be within 30 feet of each " +
                "other when you target them.";
    }

}
