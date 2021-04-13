package spells.seven;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FireStorm extends Spell {

    public FireStorm() {
        name = "Fire Storm";
        level = 7;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(150);
        target = new Target(Aberbo);
        ritual = false;
        description = "A storm made up of sheets of roaring flame appears in a location you choose within range. The " +
                "area of the storm consists of up to ten 10-foot-cubes, which you can arrange as you wish. Each cube " +
                "must have at least one face adjacent to the face of another cube. Each creature in the area must " +
                "make a Dexterity saving throw. It takes 7d10 fire damage on a failed save, or half as much damage on" +
                " a successful one.The fire damages objects in the area and ignites flammable objects that aren't " +
                "being worn or carried. If you choose, plant life in the area is unaffected by this spell.";
    }

}
