package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Enthrall extends Spell {

    public Enthrall() {
        name = "Enthrall";
        level = 2;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "You weave a distracting string of words, causing creatures of your choice that you can see " +
                "within range and that can hear you to make a Wisdom saving throw. Any creature that can't be charmed" +
                " succeeds on this saving throw automatically, and if you or your companions are fighting a creature," +
                " it has advantage on the save. On a failed save, the target has disadvantage on Wisdom (Perception) " +
                "checks made to perceive any creature other than you until the spell ends or until the target can no " +
                "longer hear you. The spell ends if you are incapacitated or can no longer speak.";
    }

}
