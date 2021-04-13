package spells.three;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class HypnoticPattern extends Spell {

    public HypnoticPattern() {
        name = "Hypnotic Pattern";
        level = 3;
        school = Schools.ILLUSION;
        components = new Components[]{
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a glowing stick of incense or a crystal vial filled with phosphorescent material";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(120);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create a twisting pattern of colors that weaves through the air inside a 30-foot cube within range. The pattern appears for a moment and vanishes. Each creature in the area who sees the pattern must make a Wisdom saving throw. On a failed save, the creature becomes charmed for the duration. While charmed by this spell, the creature is incapacitated and has a speed of 0.The spell ends for an affected creature if it takes any damage or if someone else uses an action to shake the creature out of its stupor.";
    }

}
