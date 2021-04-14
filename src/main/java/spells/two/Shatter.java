package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Shatter extends Spell {

    public Shatter() {
        name = "Shatter";
        level = 2;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a chip of mica";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        ritual = false;
        description = "A sudden loud ringing noise, painfully intense, erupts from a point of your choice within " +
                "range. Each creature in a lO-foot-radius sphere centered on that point must make a Constitution " +
                "saving throw. A creature takes 3d8 thunder damage on a failed save, or half as much damage on a " +
                "successful one. A creature made of inorganic material such as stone, crystal, or metal has " +
                "disadvantage on this saving throw.A nonmagical object that isn't being worn or carried also takes " +
                "the damage if it's in the spell's area.";
        higherLevels = "When you cast this spell using a spell slot of 3rd levei or higher, the damage increases by " +
                "ld8 for each slot level above 2nd.";
    }

}
