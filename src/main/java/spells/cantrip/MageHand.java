package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MageHand extends Spell {

    public MageHand() {
        name = "Mage Hand";
        level = 0;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(30);
        ritual = false;
        description = "A spectral, floating hand appears at a point you choose within range. The hand lasts for the " +
                "duration or until you dismiss it as an action. The hand vanishes if it is ever more than 30 feet " +
                "away from you or if you cast this spell again.You can use your action to control the hand. You can " +
                "use the hand to manipulate an object, open an unlocked door or container, stow or retrieve an item " +
                "from an open container, or pour the contents out of a vial. You can move the hand up to 30 feet each" +
                " time you use it.The hand can’t attack, activate magic items, or carry more than 10 pounds.";
    }

}
