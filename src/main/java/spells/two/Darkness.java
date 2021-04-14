package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Darkness extends Spell {

    public Darkness() {
        name = "Darkness";
        level = 2;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.MATERIAL);
        material = "bat fur and a drop of pitch or piece of coal";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(60);
        ritual = false;
        description = "Magical darkness spreads from a point you choose within range to fill a 15-foot-radius sphere " +
                "for the duration. The darkness spreads around corners. A creature with darkvision can’t see through " +
                "this darkness, and nonmagical light can’t illuminate it. If the point you choose is on an object you" +
                " are holding or one that isn’t being worn or carried, the darkness emanates from the object and " +
                "moves with it. Completely covering the source of the darkness with an opaque object, such as a bowl " +
                "or a helm, blocks the darkness. If any of this spell’s area overlaps with an area of light created " +
                "by a spell of 2nd level or lower, the spell that created the light is dispelled.";
    }

}
