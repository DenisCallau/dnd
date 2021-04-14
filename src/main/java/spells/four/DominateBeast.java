package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class DominateBeast extends Spell {

    public DominateBeast() {
        name = "Dominate Beast";
        level = 4;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(60);
        ritual = false;
        description = "You attempt to beguile a beast that you can see within range. It must succeed on a Wisdom " +
                "saving throw or be charmed by you for the duration. If you or creatures that are friendly to you are" +
                " fighting it, it has advantage on the saving throw.While the beast is charmed, you have a telepathic" +
                " link with it as long as the two of you are on the same plane of existence. You can use this " +
                "telepathic link to issue commands to the creature while you are conscious (no action required), " +
                "which it does its best to obey. You can specify a simple and general course of action, such as " +
                "'Attack that creature', 'Run over there', or 'Fetch that object'. If the creature completes the " +
                "order and doesn't receive further direction from you, it defends and preserves itself to the best of" +
                " its ability.You can use your action to take total and precise control of the target. Until the end " +
                "of your next turn, the creature takes only the actions you choose, and doesn't do anything that you " +
                "don't allow it to do. During this time, you can also cause the creature to use a reaction, but this " +
                "requires you to use your own reaction as well. Each time the target takes damage, it makes a new " +
                "Wisdom saving throw against the spell. If the saving throw succeeds, the spell ends.";
        higherLevels = "When you cast this spell with a 5th-level spell slot, the duration is concentration, up to 10" +
                " minutes. When you use a 6th-level spell slot, the duration is concentration, up to 1 hour. When you" +
                " use a spell slot of 7th level or higher, the duration is concentration, up to 8 hours.";
    }

}
