package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class AnimalFriendship extends Spell {

    public AnimalFriendship() {
        name = "Animal Friendship";
        level = 1;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a morsel of food";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "This spell lets you convince a beast that you mean it no harm. Choose a beast that you can see" +
                " within range. It must see and hear you. If the beast's Intelligence is 4 or higher, the spell fails" +
                ". Otherwise, the beast must succeed on a Wisdom saving throw or be charmed by you for the spell's " +
                "duration. If you or one of your companions harms the target, the spell ends.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, you can affect one " +
                "additional beast for each slot level above 1st.";
    }

}
