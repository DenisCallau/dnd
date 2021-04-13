package spells.eight;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Earthquake extends Spell {

    public Earthquake() {
        name = "Earthquake";
        level = 8;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a pinch of dirt, a piece of rock, and a lump of clay";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(500);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create a seismic disturbance at a point on the ground that you can see within range. For " +
                "the duration, an intense tremor rips through the ground in a 100-foot-radius circle centered on that" +
                " point and shakes creatures and structures in contact with the ground in that area.The ground in the" +
                " area becomes difficult terrain. Each creature on the ground that is concentrating must make a " +
                "Constitution saving throw. On a failed save, the creature's concentration is broken.When you cast " +
                "this spell and at the end of each turn you spend concentrating on it, each creature on the ground in" +
                " the area must make a Dexterity saving throw. On a failed save, the creature is knocked prone.This " +
                "spell can have additional effects depending on the terrain in the area, as determined by the DM.A " +
                "fissure that opens beneath a structure causes it to automatically collapse (see below).";
    }

}
