package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class SpiritGuardians extends Spell {

    public SpiritGuardians() {
        name = "Spirit Guardians";
        level = 3;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a holy symbol";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "You call forth spirits to protect you. They flit around you to a distance of 15 feet for the " +
                "duration. If you are good or neutral, their spectral form appears angelic or fey (your choice). If " +
                "you are evil, they appear fiendish.When you cast this spell, you can designate any number of " +
                "creatures you can see to be unaffected by it. An affected creature’s speed is halved in the area, " +
                "and when the creature enters the area for the first time on a turn or starts its turn there, it must" +
                " make a Wisdom saving throw. On a failed save, the creature takes 3d8 radiant damage (if you are " +
                "good or neutral) or 3d8 necrotic damage (if you are evil). On a successful save, the creature takes " +
                "half as much damage.";
        higherLevels = "When you cast this spell using a spell slot of 4th level or higher, the damage increases by " +
                "1d8 for each slot level above 3rd.";
    }

}
