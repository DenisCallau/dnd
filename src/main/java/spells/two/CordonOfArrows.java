package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class CordonOfArrows extends Spell {

    public CordonOfArrows() {
        name = "Cordon Of Arrows";
        level = 2;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "four or more arrows or bolts";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(5);
        target = new Target(Aberbo);
        ritual = false;
        description = "You plant four pieces of nonmagical ammunition—arrows or crossbow bolts—in the ground within " +
                "range and lay magic upon them to protect an area. Until the spell ends, whenever a creature other " +
                "than you comes within 30 feet of the ammunition for the first time on a turn or ends its turn there," +
                " one piece of ammunition flies up to strike it. The creature must succeed on a Dexterity saving " +
                "throw or take 1d6 piercing damage. The piece of ammunition is then destroyed. The spell ends when no" +
                " ammunition remains.When you cast this spell, you can designate any creatures you choose, and the " +
                "spell ignores them.";
        higherLevels = "When you cast this spell using a spell slot of 3rd level or higher, the amount of ammunition " +
                "that can be affected increases by two for each slot level above 2nd.";
    }

}
