package spells.seven;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Resurrection extends Spell {

    public Resurrection() {
        name = "Resurrection";
        level = 7;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a diamond worth at least 1,000 gp, which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.HOUR);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(0);
        ritual = false;
        description = "You touch a dead creature that has been dead for no more than a century, that didn't die of " +
                "old age, and that isn't undead. If its soul is free and willing, the target returns to life with all" +
                " its hit points.This spell neutralizes any poisons and cures normal diseases afflicting the creature" +
                " when it died. It doesn't however, remove magical diseases, curses, and the like; if such effects " +
                "aren't removed prior to casting the spell, the afflict the target on its return to life.This spell " +
                "closes all mortal wounds and restores any missing body parts.Coming back from the dead is an ordeal." +
                " The target takes a -4 penalty to all attack rolls, saving throws, and ability checks. Every time " +
                "the target finishes a long rest, the penalty is reduced by 1 until it disappears.Casting this spell " +
                "to restore life to a creature that has been dead for one year or longer taxes you greatly. Until you" +
                " finish a long rest, you can't cast spells again, and you have disadvantage on all attack rolls, " +
                "ability checks, and saving throws.";
    }

}
