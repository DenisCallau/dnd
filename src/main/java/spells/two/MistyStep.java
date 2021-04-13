package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MistyStep extends Spell {

    public MistyStep() {
        name = "Misty Step";
        level = 2;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "Briefly surrounded by silvery mist, you teleport up to 30 feet to an unoccupied space that you" +
                " can see.";
    }

}
