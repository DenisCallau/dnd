package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MeldintoStone extends Spell {

    public MeldintoStone() {
        name = "Meld into Stone";
        level = 3;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = true;
        description = "You step into a stone object or surface large enough tofully contain your body, melding " +
                "yourself and all the equipment you carry with the stone for the duration. Using your movement, you " +
                "step into the stone at a point you can touch. Nothing of your presence remains visible or otherwise " +
                "detectable by nonmagical senses.While merged with the stone, you can’t see what occurs outside it, " +
                "and any Wisdom (Perception) checks you make to hear sounds outside it are made with disadvantage. " +
                "You remain aware of the passage of time and can cast spells on yourself while merged in the stone. " +
                "You can use your movement to leave the stone where you entered it, which ends the spell. You " +
                "otherwise can’t move.Minor physical damage to the stone doesn’t harm you, but its partial " +
                "destruction or a change in its shape (to the extent that you no longer fit w ithin it) expels you " +
                "and deals 6d6 bludgeoning damage to you. The stone’s complete destruction (or transmutation into a " +
                "different substance) expels you and deals 50 bludgeoning damage to you. If expelled, you fall prone " +
                "in an unoccupied space closest to where you first entered.";
    }

}
