package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ChainLightning extends Spell {

    public ChainLightning() {
        name = "Chain Lightning";
        level = 6;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a bit of fur; a piece of amber, glass or a crystal rod; and three silver pins";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(150);
        ritual = false;
        description = "You create a bolt of lightning that arcs toward a target of your choice that you can see " +
                "within range. Three bolts then leap from that target to as many as three other targets, each of " +
                "which must be within 30 feet of the first target. A target can be a creature or an object and can be" +
                " targeted by only one of the bolts.A target must make a Dexterity saving throw. The target takes " +
                "10d8 lightning damage on a failed save, or half as much damage on a successful one.";
        higherLevels = "When you cast this spell using a spell slot of 7th level or higher, one additional bolt leaps" +
                " from the first target to another target for each slot level above 6th.";
    }

}
