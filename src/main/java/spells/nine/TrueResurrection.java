package spells.nine;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class TrueResurrection extends Spell {

    public TrueResurrection() {
        name = "True Resurrection";
        level = 9;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a sprinkle of holy water and diamonds worth at least 25,000 gp, which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.HOUR);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You touch a creature that has been dead for no longer than 200 years and that died for any " +
                "reason except old age. If the creature's soul is free and willing, the creature is restored to life " +
                "with all its hit points.This spell closes all wounds, neutralizes any poison, cures all diseases, " +
                "and lifts any curses affecting the creature when it died. The spell replaces damaged or missing " +
                "organs and limbs.The spell can even provide a new body if the original no longer exists, in which " +
                "case you must speak the creature's name. The creature then appears in an unoccupied space you choose" +
                " within 10 feet of you.";
    }

}
