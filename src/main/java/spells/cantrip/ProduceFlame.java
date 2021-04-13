package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ProduceFlame extends Spell {

    public ProduceFlame() {
        name = "Produce Flame";
        level = 0;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "A flickering flame appears in your hand. The flame remains there for the duration and harms " +
                "neither you nor your equipment. The flame sheds bright light in a 10-foot radius and dim light for " +
                "an additional 10 feet. The spell ends if you dismiss it as an action or if you cast it again.You can" +
                " also attack with the flame, although doing so ends the spell. When you cast this spell, or as an " +
                "action on a later turn, you can hurl the flame at a creature within 30 feet of you. Make a ranged " +
                "spell attack. On a hit, the target takes 1d8 fire damage.This spell's damage increases by 1d8 when " +
                "you reach 5th level (2d8), 11th level (3d8), and 17th level (4d8).";
    }

}
