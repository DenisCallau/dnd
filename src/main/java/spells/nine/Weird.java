package spells.nine;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Weird extends Spell {

    public Weird() {
        name = "Weird";
        level = 9;
        school = Schools.ILLUSION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(120);
        target = new Target(Aberbo);
        ritual = false;
        description = "Drawing on the deepest fears of a group of creatures, you create illusory creatures in their minds, visible only to them. Each creature in a 30-foot-radius sphere centered on a point of your choice within range must make a Wisdom saving throw. On a failed save, a creature becomes frightened for the duration. The illusion calls on the creature's deepest fears, manifesting its worst nightmares as an implacable threat. At the start of each of the frightened creature's turns, it must succeed on a Wisdom saving throw or take 4d10 psychic damage. On a successful save, the spell ends for that creature.";
    }

}