package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class WindWall extends Spell {

    public WindWall() {
        name = "Wind Wall";
        level = 3;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a tiny fan and a feather of exotic origin";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(120);
        target = new Target(Aberbo);
        ritual = false;
        description = "A wall of strong wind rises from the ground at a point you choose within range. You can make " +
                "the wall up to 50 feet long, 15 feet high, and 1 foot thick. You can shape the wall in any way you " +
                "choose so long as it makes one continuous path along the ground. The wall lasts for the duration" +
                ".When the wall appears, each creature within its area must make a Strength saving throw. A creature " +
                "takes 3d8 bludgeoning damage on a failed save, or half as much damage on a successful one.The strong" +
                " wind keeps fog, smoke, and other gases at bay. Small or smaller flying creatures or objects can't " +
                "pass through the wall. Loose, lightweight materials brought into the wall fly upward. Arrows, bolts," +
                " and other ordinary projectiles launched at targets behind the wall are deflected upward and " +
                "automatically miss. (Boulders hurled by giants or siege engines, and similar projectiles, are " +
                "unaffected.) Creatures in gaseous form can’t pass through it.";
    }

}
