package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Cloudkill extends Spell {

    public Cloudkill() {
        name = "Cloudkill";
        level = 5;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(120);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create a 20-foot-radius sphere of poisonous, yellow-green fog centered on a point you " +
                "choose within range. The fog spreads around corners. It lasts for the duration or until strong wind " +
                "disperses the fog, ending the spell. Its area is heavily obscured.When a creature enters the spell's" +
                " area for the first time on a turn or starts its turn there, that creature must make a Constitution " +
                "saving throw. The creature takes 5d8 poison damage on a failed save, or half as much damage on a " +
                "successful one. Creatures are affected even if they hold their breath or don't need to breathe.The " +
                "fog moves 10 feet away from you at the start of each of your turns, rolling along the surface of the" +
                " ground. The vapors, being heavier than air, sink to the lowest level of the land, even pouring down" +
                " openings.";
        higherLevels = "When you cast this spell using a spell slot of 6th level or higher, the damage increases by " +
                "1d8 for each slot level above 5th.";
    }

}
