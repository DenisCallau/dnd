package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class InvestitureofIce extends Spell {

    public InvestitureofIce() {
        name = "Investiture of Ice";
        level = 6;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "* You are immune to cold damage and have resistance to fire damage.* You can move across " +
                "difficult terrain created by ice or snow without spending extra movement.* The ground in a 10-foot " +
                "radius around you is icy and is difficult terrain for creatures other than you. The radius moves " +
                "with you.* You can use your action to create a 15-foot cone of freezing wind extending from your " +
                "outstretched hand in a direction you choose. Each creature in the cone must make a Constitution " +
                "saving throw. A creature takes 4d6 cold damage on a failed save, or half as much damage on a " +
                "successful one. A creature that fails its save against this effect has its speed halved until the " +
                "start of your next turn.";
    }

}
