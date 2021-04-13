package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class WallofIce extends Spell {

    public WallofIce() {
        name = "Wall of Ice";
        level = 6;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a small piece of quartz";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(120);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create a wall of ice on a solid surface within range. You can form it into a hemispherical" +
                " dome or a sphere with a radius of up to 10 feet, or you can shape a flat surface made up of ten " +
                "10-foot-square panels. Each panel must be contiguous with another panel. In any form, the wall is 1 " +
                "foot thick and lasts for the duration.If the wall cuts through a creature’s space when it appears, " +
                "the creature within its area is pushed to one side of the wall and must make a Dexterity saving " +
                "throw. On a failed save, the creature takes 10d6 cold damage, or half as much damage on a successful" +
                " save.The wall is an object that can be damaged and thus breached. It has AC 12 and 30 hit points " +
                "per 10-foot section, and it is vulnerable to fire damage. Reducing a 10-foot section of wall to 0 " +
                "hit points destroys it and leaves behind a sheet of frigid air in the space the wall occupied. A " +
                "creature moving through the sheet of frigid air for the first time on a turn must make a " +
                "Constitution saving throw. That creature takes 5d6 cold damage on a failed save, or half as much " +
                "damage on a successful one.";
        higherLevels = "When you cast this spells using a spells slot of 7th level or higher, the damage the wall " +
                "deals when it appears increases by 2d6, and the damage from passing through the sheet of frigid air " +
                "increases by 1d6, for each slot level above 6th.";
    }

}
