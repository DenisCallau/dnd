package spells.eight;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Demiplane extends Spell {

    public Demiplane() {
        name = "Demiplane";
        level = 8;
        school = Schools.CONJURATION;
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create a shadowy door on a flat solid surface that you can see within range. The door is " +
                "large enough to allow Medium creatures to pass through unhindered. When opened, the door leads to a " +
                "demiplane that appears to be an empty room 30 feet in each dimension, made of wood or stone. When " +
                "the spell ends, the door disappears, and any creatures or objects inside the demiplane remain " +
                "trapped there, as the door also disappears from the other side.Each time you cast this spell, you " +
                "can create a new demiplane, or have the shadowy door connect to a demiplane you created with a " +
                "previous casting of this spell.  Additionally, if you know the nature and contents of a demiplane " +
                "created by a casting of this spell by another creature, you can have the shadowy door connect to its" +
                " demiplane instead.";
    }

}
