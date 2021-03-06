package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FindTraps extends Spell {

    public FindTraps() {
        name = "Find Traps";
        level = 2;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(120);
        ritual = false;
        description = "You sense the presence of any trap within range that is within line of sight. A trap, for the " +
                "purpose of this spell, includes anything that would inflict a sudden or unexpected effect you " +
                "consider harmful or undesirable, which was specifically intended as such by its creator. Thus, the " +
                "spell would sense an area affected by the *[alarm](../alarm/ 'alarm (lvl 1)')* spell, a *[glyph of " +
                "warding](../glyph-of-warding/ 'glyph of warding (lvl 3)')*, or a mechanical pit trap, but it would " +
                "not reveal a natural weakness in the floor, an unstable ceiling, or a hidden sinkhole.This spell " +
                "merely reveals that a trap is present. You don't learn the location of each trap, but you do learn " +
                "the general nature of the danger posed by a trap you sense.";
    }

}
