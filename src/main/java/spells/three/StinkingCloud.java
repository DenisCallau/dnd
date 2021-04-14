package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class StinkingCloud extends Spell {

    public StinkingCloud() {
        name = "Stinking Cloud";
        level = 3;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a rotten egg or several skunk cabbage leaves";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(90);
        ritual = false;
        description = "You create a 20-foot-radius sphere of yellow, nauseating gas centered on a point within range." +
                " The cloud spreads around corners, and its area is heavily obscured. The cloud lingers in the air " +
                "for the duration.Each creature that is completely within the cloud at the start of its turn must " +
                "make a Constitution saving throw against poison. On a failed save, the creature spends its action " +
                "that turn retching and reeling. Creatures that don’t need to breathe or are immune to poison " +
                "automatically succeed on this saving throw.A moderate wind (at least 10 miles per hour) disperses " +
                "the cloud after 4 rounds. A strong wind (at least 20 miles per hour) disperses it after 1 round.";
    }

}
