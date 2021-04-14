package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class GiantInsect extends Spell {

    public GiantInsect() {
        name = "Giant Insect";
        level = 4;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(30);
        ritual = false;
        description = "You transform up to ten centipedes, three spiders, five wasps, or one scorpion within range " +
                "into versions of their natural forms for the duration. A centipede becomes a giant centipede, a " +
                "spider becomes a giant spider, a wasp becomes a giant wasp, a wasp becomes a giant wasp, and a " +
                "scorpion becomes a giant scorpion.Each creature obeys your verbal commands, and in combat they act " +
                "on your turn each round. The DM has the statistics for these creatures and resolves their actions " +
                "and moment.A creature remains in its giant size for the duration until it drops to 0 hit points, or " +
                "until you use an action to dismiss the effect on it.The DM might allow you to choose different " +
                "targets. for example, if you transform a bee, its giant version might have the same stats as a giant" +
                " wasp.";
    }

}
