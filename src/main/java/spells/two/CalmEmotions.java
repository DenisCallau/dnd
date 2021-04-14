package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class CalmEmotions extends Spell {

    public CalmEmotions() {
        name = "Calm Emotions";
        level = 2;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(60);
        ritual = false;
        description = "You attempt to suppress strong emotions in a group of people. Each humanoid in a " +
                "20-foot-radius sphere centered on a point you choose within range must make a Charisma saving throw;" +
                " a creature can choose to fail this saving throw if it wishes. If a creature fails its saving throw," +
                " choose one of the following two effects. You can suppress any effect causing a target to be charmed" +
                " or frightened. When this spell ends, any suppressed effect resumes, provided that its duration has " +
                "not expired in the meantime.Alternatively, you can make a target indifferent about creatures o f " +
                "your choice that it is hostile toward. This indifference ends if the target is attacked or harmed by" +
                " a spell or if it witnesses any of its friends being harmed. When the spell ends, the creature " +
                "becomes hostile again, unless the DM rules otherwise.";
    }

}
