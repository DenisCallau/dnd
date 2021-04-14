package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Bane extends Spell {

    public Bane() {
        name = "Bane";
        level = 1;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a drop of blood";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(30);
        ritual = false;
        description = "Up to three creatures of your choice that you can see within range must make Charisma saving " +
                "throws. Whenever a target that fails this saving throw makes an attack roll or a saving throw before" +
                " the spell ends, the target must roll a d4 and subtract the number rolled from the attack roll or " +
                "saving throw.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, you can target one " +
                "additional creature for each slot level above 1st.";
    }

}
