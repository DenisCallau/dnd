package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class RaiseDead extends Spell {

    public RaiseDead() {
        name = "Raise Dead";
        level = 5;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a diamond worth at least 500 gp, which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.HOUR);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You return a dead creature you touch to life, provided that it has been dead no longer than 10" +
                " days. If the creature's soul is both willing and at liberty to rejoin the body, the creature " +
                "returns to life with 1 hit point.This spell also neutralizes any poisons and cures nonmagical " +
                "diseases that affected the creature at the time it died. This spell doesn't, however, remove magical" +
                " diseases, curses, or similar effects; if these aren't first removed prior to casting the spell, " +
                "they take effect when the creature returns to life. The spell can’t return an undead creature to " +
                "life.This spell closes all mortal wounds, but it doesn't restore missing body parts. If the creature" +
                " is lacking body parts or organs integral for its survival—its head, for instance—the spell " +
                "automatically fails.Coming back from the dead is an ordeal. The target takes a penalty to all attack" +
                " rolls, saving throws, and ability checks. Every time the target finishes a long rest, the penalty " +
                "is reduced by 1 until it disappears.";
    }

}
