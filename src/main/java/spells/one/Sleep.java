package spells.one;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Sleep extends Spell {

    public Sleep() {
        name = "Sleep";
        level = 1;
        school = Schools.ENCHANTMENT;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a pinch of fine sand, rose petals, or a cricket";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(90);
        target = new Target(Aberbo);
        ritual = false;
        description = "This spell sends creatures into a magical slumber. Roll 5d8; the total is how many hit points of creatures this spell can affect. Creatures within 20 feet of a point you choose within range are affected in ascending order of their current hit points (ignoring unconscious creatures).Starting with the creature that has the lowest current hit points, each creature affected by this spell falls unconscious until the spell ends, the sleeper takes damage, or someone uses an action to shake or slap the sleeper awake. Subtract each creature�s hit points from the total before moving on to the creature with the next lowest hit points. A creature�s hit points must be equal to or less than the remaining total for that creature to be affected.Undead and creatures immune to being charmed aren�t affected by this spell.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, roll an additional 2d8 for each slot level above 1st.";
    }

}
