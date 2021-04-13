package spells.seven;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class DelayedBlastFireball extends Spell {

    public DelayedBlastFireball() {
        name = "Delayed Blast Fireball";
        level = 7;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a tiny ball of bat guano and sulfur";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(150);
        target = new Target(Aberbo);
        ritual = false;
        description = "A beam of yellow light flashes from your pointing finger, then condenses to linger at a chose " +
                "point within range as a glowing bead for the duration. When the spell ends, either because your " +
                "concentration is broken or because you decide to end it, the bead blossoms with a low roar into an " +
                "explosion of flame that spreads around corners. Each creature in a 20-foot-radius sphere centered on" +
                " that point must make a Dexterity saving throw. A creature takes fire damage equal to the total " +
                "accumulated damage on a failed save, or half as much damage on a successful one.The spell's base " +
                "damage is 12d6. If at the end of your turn the bead has not yet detonated, the damage increases by " +
                "1d6.If the glowing bead is touched before the interval has expired, the creature touching it must " +
                "make a Dexterity saving throw. On a failed save, the spell ends immediately, causing the bead to " +
                "erupt in flame. On a successful save, the creature can throw the bead up to 40 feet. When it strikes" +
                " a creature or a solid object, the spell ends, and the bead explodes.The fire damages objects in the" +
                " area dn ignites flammable objects that aren't being worn or carried.";
        higherLevels = "When you cast theis spell using a spell slot of 8th level or higher, the base damage " +
                "increases by 1d6 for each slot level above 7th.";
    }

}
