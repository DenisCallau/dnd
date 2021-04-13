package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class DisguiseSelf extends Spell {

    public DisguiseSelf() {
        name = "Disguise Self";
        level = 1;
        school = Schools.ILLUSION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "You make yourself -- including your clothing, armor, weapons, and other belongings on your " +
                "person -- look different until the spell ends or until you use your action to dismiss it. You can " +
                "seem 1 foot shorter or taller and can appear thin, fat, or in between. You can't change your body " +
                "type, so you must adopt a form that has the same basic arrangement of limbs. Otherwise, the extent " +
                "of the illusion is up to you.The changes wrought by this spell fail to hold up to physical " +
                "inspection. For example, if you use this spell to add a hat to your outfit, objects pass through the" +
                " hat, and anyone who touches it would feel nothing or would feel your head and hair. If you use this" +
                " spell to appear thinner than you are, the hand of someone who reaches out to touch you would bump " +
                "into you while it was seemingly still in midair.To discern that you are disguised, a creature can " +
                "use its action to inspect your apperance and must succeed on an Intelligence (Investigation) check " +
                "against your spell save DC.";
    }

}
