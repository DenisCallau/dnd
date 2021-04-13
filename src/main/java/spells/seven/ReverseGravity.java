package spells.seven;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ReverseGravity extends Spell {

    public ReverseGravity() {
        name = "Reverse Gravity";
        level = 7;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a lodestone and iron filings";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(100);
        target = new Target(Aberbo);
        ritual = false;
        description = "This spell reverses gravity in a 50-foot-radius, 100-foot high cylinder centered on a point " +
                "within range. All creatures and objects that aren't somehow anchored to the ground in the area fall " +
                "upward and reach the top of the area when you cast this spell. A creature can make a Dexterity " +
                "saving throw to grab onto a fixed object it can reach, thus avoiding the fall.If some solid object " +
                "(such as a ceiling) is encountered in this fall, falling objects and creature strike it just as they" +
                " would during a normal downward fall. If an object or creature reaches the top of the area without " +
                "striking anything, it remains there, oscillating slightly, for the duration.At the end of the " +
                "duration, affected objects and creatures fall back down.";
    }

}
