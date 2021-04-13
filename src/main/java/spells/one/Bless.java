package spells.one;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Bless extends Spell {

    public Bless() {
        name = "Bless";
        level = 1;
        school = Schools.ENCHANTMENT;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a sprinkling of holy water";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "You bless up to three creatures of your choice within range. Whenever a target makes an attack roll or a saving throw before the spell ends, the target can roll a d4 and add the number rolled to the attack roll or saving throw.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, you can target one additional creature for each slot level above 1st.";
    }

}
