package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ZoneofTruth extends Spell {

    public ZoneofTruth() {
        name = "Zone of Truth";
        level = 2;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(60);
        ritual = false;
        description = "You create a magical zone that guards against deception in a 15-foot-radius sphere centered on" +
                " a point of your choice within range. Until the spell ends, a creature that enters the spell's area " +
                "for the first time on turn or starts its turn there must make a Charisma saving throw. On a failed " +
                "save, a creature can't speak a deliberate lie while in the radius. you know whether each creature " +
                "succeeds or fails on its saving throw.An affected creature is aware of the spell and can thus avoid " +
                "answering questions to which it would normally respond with a lie. Such a creature can be evasive in" +
                " its answers as long as it remains within the boundaries of the truth.";
    }

}
