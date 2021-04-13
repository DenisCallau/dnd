package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class VitriolicSphere extends Spell {

    public VitriolicSphere() {
        name = "Vitriolic Sphere";
        level = 4;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a drop of giant slug bile";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(150);
        target = new Target(Aberbo);
        ritual = false;
        description = "You point at a place within range, and a glowing 1-foot ball of emerald acid streaks there and" +
                " explodes in a 20-foot radius. Each creature in that area must make a Dexterity saving throw. On a " +
                "failed save, a creature takes 10d4 acid damage and 5d4 acid damage at the end of its next turn. On a" +
                " successful save, a creature takes half the initial damage and no damage at the end of its next turn.";
        higherLevels = "When you cast this spell using a spell slot of 5th level or higher, the initial damage " +
                "increases by 2d4 for each slot level above 4th.";
    }

}
