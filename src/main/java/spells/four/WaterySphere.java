package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class WaterySphere extends Spell {

    public WaterySphere() {
        name = "Watery Sphere";
        level = 4;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a droplet of water";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(90);
        ritual = false;
        description = "You conjure up a sphere of water with a 10-foot radius on a point you can see within range. " +
                "The sphere can hover in the air, but no more than 10 feet off the ground. The sphere remains for the" +
                " spell’s duration.Any creature in the sphere’s space must make a Strength saving throw. On a " +
                "successful save, a creature is ejected from that space to the nearest unoccupied space outside it. A" +
                " Huge or larger creature succeeds on the saving throw automatically. On a failed save, a creature is" +
                " restrained by the sphere and is engulfed by the water. At the end of each of its turns, a " +
                "restrained target can repeat the saving throw.The sphere can restrain a maximum of four Medium or " +
                "smaller creatures or one Large creature. If the sphere restrains a creature in excess of these " +
                "numbers, a random creature that was already restrained by the sphere falls out of it and lands prone" +
                " in a space within 5 feet of it.As an action, you can move the sphere up to 30 feet in a straight " +
                "line. If it moves over a pit, cliff, or other drop, it safely descends until it is hovering 10 feet " +
                "over ground. Any creature restrained by the sphere moves with it. You can ram the sphere into " +
                "creatures, forcing them to make the saving throw, but no more than once per turn.When the spell " +
                "ends, the sphere falls to the ground and extinguishes all normal flames within 30 feet of it. Any " +
                "creature restrained by the sphere is knocked prone in the space where it falls.";
    }

}
