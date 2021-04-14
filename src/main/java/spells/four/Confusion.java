package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Confusion extends Spell {

    public Confusion() {
        name = "Confusion";
        level = 4;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "three nut shells";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(90);
        ritual = false;
        description = "This spell assaults and twists creatures' minds, spawning delusions and provoking uncontrolled" +
                " action. Each creature in a 10-foot radius sphere centered on a point you choose within range must " +
                "succeed on a Wisdom saving throw when you cast this spell or by affected by it.An affected target " +
                "can't take reactions and must roll a d10 at the start of each of its turns to determine its " +
                "behaviour for that turn.At the end of each of its turns, an affected target can make a Wisdom saving" +
                " throw. If it succeeds, this effect ends for that target";
        higherLevels = "When you cast this spell using a spell slot of 5th level or higher, the radius of the sphere " +
                "increases by 5 feet for each spell slot above 4th.";
    }

}
