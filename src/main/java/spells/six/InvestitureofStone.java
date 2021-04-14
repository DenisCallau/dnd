package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class InvestitureofStone extends Spell {

    public InvestitureofStone() {
        name = "Investiture of Stone";
        level = 6;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "* You have resistance to bludgeoning, piercing, and slashing damage from nonmagical weapons.* " +
                "You can use your action to create a small earthquake on the ground in a 15-foot radius centered on " +
                "you. Other creatures on that ground must succeed on a Dexterity saving throw or be knocked prone.* " +
                "You can move across difficult terrain made of earth or stone without spending extra movement. You " +
                "can move through solid earth or stone as if it was air and without destabilizing it, but you can’t " +
                "end your movement there. If you do so, you are ejected to the nearest unoccupied space, this spell " +
                "ends, and you are stunned until the end of your next turn";
    }

}
