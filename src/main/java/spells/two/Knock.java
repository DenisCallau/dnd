package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Knock extends Spell {

    public Knock() {
        name = "Knock";
        level = 2;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "Choose an object that you can see within range. The object can be a door, a box, a chest, a " +
                "set of manacles, a padlock, or another object that contains a mundane or magical means that prevents" +
                " access.A target that is held shut by a mundane lock ar that is stuck or barred becomes unlocked, " +
                "unstuck, or unbarred. If the object has multiple locks, only one of them is unlocked.If you choose a" +
                " target that is held shut with *[arcane lock](../arcane-lock/ 'arcane lock (lvl 2)')*, that spell is" +
                " suppressed for 10 minutes, during which time the target can be opened and shut normally.When you " +
                "cast the spell, a loud knock, audible from as far away as 300 feet, emanates from the target object.";
    }

}
