package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class WallofForce extends Spell {

    public WallofForce() {
        name = "Wall of Force";
        level = 5;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a pinch of powder made by crushing a clear gemstone";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(120);
        ritual = false;
        description = "An invisible wall of force springs into existence at a point you choose within range. The wall" +
                " appears in any orientation you choose, as a horizontal or vertical barrier or at an angle. It can " +
                "be free floating or resting on a solid surface. You can form it into a hemispherical dome or a " +
                "sphere with a radius of up to 10 feet, or you can shape a flat surface made up of ten " +
                "10-foot-by-10-foot panels. Each panel must be contiguous with another panel. In any form, the wall " +
                "is 1/4 inch thick. It lasts for the duration. If the wall cuts through a creature’s space when it " +
                "appears, the creature is pushed to one side of the wall (your choice which side).Nothing can " +
                "physically pass through the wall. It is immune to all damage and can’t be dispelled by *[dispel " +
                "magic](../dispel-magic/ 'dispel magic (lvl 3)')*. A *[disintegrate](../disintegrate/ 'disintegrate " +
                "(lvl 6)')* spell destroys the wall instantly, however. The wall also extends into the Ethereal " +
                "Plane, blocking ethereal travel through the wall.";
    }

}
