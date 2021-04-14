package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ConjureVolley extends Spell {

    public ConjureVolley() {
        name = "Conjure Volley";
        level = 5;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "one piece of ammunition or one throwing weapon";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(150);
        ritual = false;
        description = "You fire a piece of nonmagical ammunition from a ranged weapon or throw a nonmagical weapon " +
                "into the air and choose a point within range. Hundreds of duplicates of the ammunition or weapon " +
                "fall in a volley from above and then disappear. Each creature in a 40-foot-radius, 20-foot-high " +
                "cylinder centered on that point must make a Dexterity saving throw. A creature takes 8d8 damage on a" +
                " failed save, or half as much damage on a successful one. The damage type is the same as that of the" +
                " ammunition or weapon.";
    }

}
