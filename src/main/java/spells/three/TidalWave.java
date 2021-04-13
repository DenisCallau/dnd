package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class TidalWave extends Spell {

    public TidalWave() {
        name = "Tidal Wave";
        level = 3;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a drop of water";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(120);
        target = new Target(Aberbo);
        ritual = false;
        description = "You conjure up a wave of water that crashes down on an area within range. The area can be up " +
                "to 30 feet long, up to 10 feet wide, and up to 10 feet tall. Each creature in that area must make a " +
                "Dexterity saving throw. On a failure, a creature takes 4d8 bludgeoning damage and is knocked prone. " +
                "On a success, a creature takes half as much damage and isn’t knocked prone. The water then spreads " +
                "out across the ground in all directions, extinguishing unprotected flames in its area and within 30 " +
                "feet of it.";
    }

}
