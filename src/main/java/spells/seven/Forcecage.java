package spells.seven;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Forcecage extends Spell {

    public Forcecage() {
        name = "Forcecage";
        level = 7;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "ruby dust worth 1,500 gp";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(100);
        target = new Target(Aberbo);
        ritual = false;
        description = "An immobile, invisible, cube-shaped prison composed of magical force springs into existence " +
                "around an area you choose within range. The prison can be a cage or a solid box, as you choose.A " +
                "prison in the shape of a cage can be up to 20 feet on a side and is made from 1/2-inch diameter bars" +
                " spaced 1/2-inch apart.A prison in the shape of a box can be up to 10 feet on a size, creating a " +
                "solid barrier that prevents any matter from passing through it and blocking any spells cast into or " +
                "out from the area.When you cast the spell, any creature that is completely inside the cage's area is" +
                " trapped. Creatures only partially within the area, or those too large to fit inside the area, are " +
                "pushed away from the center of the area until they are completely outside the area.A creature inside" +
                " the cage can't leave it by nonmagical means. If the creature tries to use teleportation or " +
                "interplanar travel to leave the cage, it must first make a Charisma saving throw. On a success, the " +
                "creature can use that magic to exit the cage. On a failure, the creature can't exit the cage and " +
                "wastes the use of the spell or effect. The cage also extends into the Ethereal Plane, blocking " +
                "ethereal travel.This spell can't be dispelled by _[dispel magic](../dispel-magic/ 'dispel magic (lvl" +
                " 3)')_.";
    }

}
