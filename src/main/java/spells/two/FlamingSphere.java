package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FlamingSphere extends Spell {

    public FlamingSphere() {
        name = "Flaming Sphere";
        level = 2;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a bit of tallow, a pinch of brimstone, and a dusting of powdered iron";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "A 5-foot-diameter sphere of fire appears in an unoccupied space of your choice within range " +
                "and lasts for the duration. Any creature that ends its turn within 5 feet of the sphere must make a " +
                "Dexterity saving throw. The creature takes 2d6 fire damage on a failed save, or half as much damage " +
                "on a successful one.As a bonus action, you can move the sphere up to 30 feet. If you ram the sphere " +
                "into a creature, that creature must make the saving throw against the sphere's damage, and the " +
                "sphere stops moving this turn.When you move the sphere, you can direct it over barriers up to 5 feet" +
                " tall and jump it across pits up to 10 feet wide. The sphere ignites flammable objects not being " +
                "worn or carried, and it sheds bright light in a 20-foot radius and dim light for an additional 20 " +
                "feet.";
        higherLevels = "When you cast this spell using a spell slot of 3rd level or higher, the damage increases by " +
                "1d6 for each slot level above 2nd.";
    }

}
