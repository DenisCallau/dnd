package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class DustDevil extends Spell {

    public DustDevil() {
        name = "Dust Devil";
        level = 2;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a pinch of dust";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "Choose an unoccupied 5-foot cube of air that you can see within range. An elemental force that" +
                " resembles a dust devil appears in the cube and lasts for the spell’s duration.Any creature that " +
                "ends its turn within 5 feet of the dust devil must make a Strength saving throw. On a failed save, " +
                "the creature takes 1d8 bludgeoning damage and is pushed 10 feet away. On a successful save, the " +
                "creature takes half as much damage and isn’t pushed.As a bonus action, you can move the dust devil " +
                "up to 30 feet in any direction. If the dust devil moves over sand, dust, loose dirt, or small " +
                "gravel, it sucks up the material and forms a 10-foot-radius cloud of debris around itself that lasts" +
                " until the start of your next turn. The cloud heavily obscures its area.";
        higherLevels = "When you cast this spell using a spell slot of 3rd level or higher, the damage increases by " +
                "1d8 for each slot level above 2nd.";
    }

}
