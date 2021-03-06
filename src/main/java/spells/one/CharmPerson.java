package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class CharmPerson extends Spell {

    public CharmPerson() {
        name = "Charm Person";
        level = 1;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(30);
        ritual = false;
        description = "You attempt to charm a humanoid you can see within range. It must make a Wisdom saving throw, " +
                "and does so with advantage if you or your companions are fighting it. If it fails the saving throw, " +
                "it is charmed by you until the spell ends or until you or your companions do anything harmful to it." +
                " The charmed creature regards you as a friendly acquaintance. When the spell ends, the creature " +
                "knows it was charmed by you.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, you can target one " +
                "additional creature for each slot level above 1st. The creatures must be within 30 feet of each " +
                "other when you target them.";
    }

}
