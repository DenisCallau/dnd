package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Fireball extends Spell {

    public Fireball() {
        name = "Fireball";
        level = 3;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a tiny ball of bat guano and sulfur";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(150);
        ritual = false;
        description = "A bright streak flashes from your pointing finger to a point you choose within range and then " +
                "blossoms with a low roar into an explosion of flame. Each creature in a 20-foot-radius sphere " +
                "centered on that point must make a Dexterity saving throw. A target takes 8d6 fire damage on a " +
                "failed save, or half as much damage on a successful one.The fire spreads around corners. It ignites " +
                "flammable objects in the area that aren't being worn or carried.";
        higherLevels = "When you cast this spell using a spell slot of 4th level or higher, the damage increases by " +
                "1d6 for each slot level above 3rd.";
    }

}
