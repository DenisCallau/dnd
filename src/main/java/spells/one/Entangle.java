package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Entangle extends Spell {

    public Entangle() {
        name = "Entangle";
        level = 1;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(90);
        ritual = false;
        description = "Grasping weeds and vines sprout from the ground in a 20-foot square starting form a point " +
                "within range. For the duration, these plants turn the ground in the area into difficult terrain.A " +
                "creature in the area when you cast the spell must succeed on a Strength saving throw or be " +
                "restrained by the entangling plants until the spell ends. A creature restrained by the plants can " +
                "use its action to make a Strength check against your spell save DC. On a success, it frees itself" +
                ".When the spell ends, the conjured plants wilt away.";
    }

}
