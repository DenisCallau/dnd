package spells.two;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class EnhanceAbility extends Spell {

    public EnhanceAbility() {
        name = "Enhance Ability";
        level = 2;
        school = Schools.TRANSMUTATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "fur or a feather from a beast";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You touch a creature and bestow upon it a magical enhancement. Choose one of the following effects; the target gains that effect until the spell ends.";
        higherLevels = "When you cast this spell using a spell slot of 3rd level or higher, you can target one additional creature for each slot level above 2nd.";
    }

}
