package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class InvestitureofFlame extends Spell {

    public InvestitureofFlame() {
        name = "Investiture of Flame";
        level = 6;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "* You are immune to fire damage and have resistance to cold damage.* Any creature that moves " +
                "within 5 feet of you for the first time on a turn or ends its turn there takes 1d10 fire damage.* " +
                "You can use your action to create a line of fire 15 feet long and 5 feet wide extending from you in " +
                "a direction you choose. Each creature in the line must make a Dexterity saving throw. A creature " +
                "takes 4d8 fire damage on a failed save, or half as much damage on a successful one.";
    }

}
