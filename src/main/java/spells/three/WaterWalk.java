package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class WaterWalk extends Spell {

    public WaterWalk() {
        name = "Water Walk";
        level = 3;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a piece of cork";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(30);
        ritual = true;
        description = "This spell grants the ability to move across any liquid surface--such as water, acid, mud, " +
                "snow, quicksand, or lava--as if it were harmless solid ground (creatures crossing molten lava can " +
                "still take damage from the heal). Up to ten willing creatures you can see within range gain this " +
                "abilily for the duration.lf you target a creature submerged in a liquid, the spell carries the " +
                "target to the surface of the liquid at a rate of 60 feet per round.";
    }

}
