package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class SpikeGrowth extends Spell {

    public SpikeGrowth() {
        name = "Spike Growth";
        level = 2;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "seven sharp thorns or seven small twigs, each sharpened to a point";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(150);
        target = new Target(Aberbo);
        ritual = false;
        description = "The ground in a 20-foot radius centered on a point within range twists and sprouts hard spikes" +
                " and thorns. The area becomes difficult terrain for the duration. When a creature moves into or " +
                "within the area, it takes 2d4 piercing damage for every 5 feet it travels.The transformation of the " +
                "ground is camouflaged to look natural. Any creature that can't see the area at the time the spell is" +
                " cast must make a Wisdom (Perception) check against your spell save DC to recognize the terrain as " +
                "hazardous before entering it.";
    }

}
