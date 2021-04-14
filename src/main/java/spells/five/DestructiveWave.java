package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class DestructiveWave extends Spell {

    public DestructiveWave() {
        name = "Destructive Wave";
        level = 5;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "You strike the ground, creating a burst of divine energy that ripples outward from you. Each " +
                "creature you choose within 30 feet of you must succeed on a Constitution saving throw or take 5d6 " +
                "thunder damage, as well as 5d6 radiant or necrotic damage (your choice), and be knocked prone. A " +
                "creature that succeeds on its saving throw takes half as much damage and isn't knocked prone.";
    }

}
