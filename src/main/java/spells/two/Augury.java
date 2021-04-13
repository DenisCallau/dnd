package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Augury extends Spell {

    public Augury() {
        name = "Augury";
        level = 2;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "specially marked sticks, bones, or similar tokens worth at least 25 gp";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = true;
        description = "* *Weal*, for good results* *Woe*, for bad results* *Weal and woe*, for both good and bad " +
                "results* *Nothing*, for results that aren’t especially good or badThe spell doesn’t take into " +
                "account any possible circumstances that might change the outcome, such as the casting of additional " +
                "spells or the loss or gain of a companion.If you cast the spell two or more times before completing " +
                "your next long rest, there is a cumulative 25 percent chance for each casting after the first that " +
                "you get a random reading. The DM makes this roll in secret.";
    }

}
