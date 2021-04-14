package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Heroism extends Spell {

    public Heroism() {
        name = "Heroism";
        level = 1;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(0);
        ritual = false;
        description = "A willing creature you touch is imbued with bravery. Until the spell ends, the creature is " +
                "immune to being frightened and gains temporary hit points equal to your spellcasting ability " +
                "modifier at the start of each of its turns. When the spell ends, the target loses any remaining " +
                "temporary hit points from this spell.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, you can target one " +
                "additional creature for each slot level above 1st.";
    }

}
