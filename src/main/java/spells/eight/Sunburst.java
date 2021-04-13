package spells.eight;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Sunburst extends Spell {

    public Sunburst() {
        name = "Sunburst";
        level = 8;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "fire and a piece of sunstone";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(150);
        target = new Target(Aberbo);
        ritual = false;
        description = "Brilliant sunlight flashes in a 60-foot radius centered on a point you choose within range. " +
                "Each creature in that light must make a Constitution saving throw. On a failed save, a creature " +
                "takes 12d6 radiant damage and is blinded for 1 minute. On a successful save, it takes half as much " +
                "damage and isn't blinded by this spell. Undead and oozes have disadvantage on this saving throw.A " +
                "creature blinded by this spell makes another Constitution saving throw at the end of each of its " +
                "turns. On a successful save, it is no longer blinded.This spell dispels any darkness in its area " +
                "that was created by a spell.";
    }

}
