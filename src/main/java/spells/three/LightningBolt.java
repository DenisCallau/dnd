package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class LightningBolt extends Spell {

    public LightningBolt() {
        name = "Lightning Bolt";
        level = 3;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a bit of fur and a rod of amber, crystal, or glass";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "A stroke of lightning forming a line 100 feet long and 5 feet wide blasts out from you in a " +
                "direction you choose. Each creature in the line must make a Dexterity saving throw. A creature takes" +
                " 8d6 lightning damage on a failed save, or half as much damage on a successful one.The lightning " +
                "ignites flammable objects in the area that aren't being worn or carried.";
        higherLevels = "When you cast this spell using a spell slot of 4th level or higher, the damage increases by " +
                "1d6 for each slot level above 3rd.";
    }

}
