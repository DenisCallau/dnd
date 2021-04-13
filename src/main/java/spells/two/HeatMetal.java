package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class HeatMetal extends Spell {

    public HeatMetal() {
        name = "Heat Metal";
        level = 2;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a piece of iron and a flame";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "Choose a manufactured metal object, such as a metal weapon or a suit of heavy or medium metal " +
                "armor, that you can see within range. You cause the object to glow red-hot. Any creature in physical" +
                " contact with the object takes 2d8 fire damage when you cast the spell. Until the spell ends, you " +
                "can use a bonus action on each of your subsequent turns to cause this damage again.If a creature is " +
                "holding or wearing the object and takes the damage from it, the creature must succeed on a " +
                "Constitution saving throw or drop the object if it can. If it doesn’t drop the object, it has " +
                "disadvantage on attack rolls and ability checks until the start of your next turn.";
        higherLevels = "When you cast this spell using a spell slot of 3rd level or higher, the damage increases by " +
                "1d8 for each slot level above 2nd.";
    }

}
