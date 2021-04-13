package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Geas extends Spell {

    public Geas() {
        name = "Geas";
        level = 5;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "You place a magical command on a creature that you can see within range, forcing it to carry " +
                "out some service or refrain from some action or course of activity as you decide. If the creature " +
                "can understand you, it must succeed on a Wisdom saving throw or become charmed by you for the " +
                "duration. While the creature is charmed by you, it takes 5d10 psychic damage each time it acts in a " +
                "manner directly counter to your instructions, but no more than once each day. A creature that can't " +
                "understand you is unaffected by the spell.You can issue any command you choose, short of an activity" +
                " that would result in certain death. Should you issue a suicidal command, the spell ends.You can end" +
                " the spell early by using an action to dismiss it. A *[remove curse](../remove-curse/ 'remove curse " +
                "(lvl 3)')*, *[greater restoration](../greater-restoration/ 'greater restoration (lvl 5)')*, or " +
                "*[wish](../wish/ 'wish (lvl 9)')* spell also ends it.";
        higherLevels = "When you cast this spell using a spell slot of 7th or 8th level, the duration is 1 year. When" +
                " you cast this spell using a spell slot of 9th level, the spell lasts until it is ended by one of " +
                "the spells mentioned above.";
    }

}
