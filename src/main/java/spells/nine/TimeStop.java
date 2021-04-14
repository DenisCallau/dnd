package spells.nine;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class TimeStop extends Spell {

    public TimeStop() {
        name = "Time Stop";
        level = 9;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "You briefly stop the flow of time for everyone but yourself. No time passes for other " +
                "creatures, while you take 1d4 + 1 turns in a row, during which you can use actions and move as " +
                "normal.This spell ends if one of the actions you use during this period, or any effects that you " +
                "create during this period, affects a creature other than you or an object being worn or carried by " +
                "someone other than you. In addition, the spell ends if you move to a place more than 1,000 feet form" +
                " the location where you cast it.";
    }

}
