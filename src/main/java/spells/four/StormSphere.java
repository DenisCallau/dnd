package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class StormSphere extends Spell {

    public StormSphere() {
        name = "Storm Sphere";
        level = 4;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(150);
        ritual = false;
        description = "A 20-foot-radius sphere of whirling air springs into existence centered on a point you choose " +
                "within range. The sphere remains for the spell’s duration. Each creature in the sphere when it " +
                "appears or that ends its turn there must succeed on a Strength saving throw or take 2d6 bludgeoning " +
                "damage. The sphere’s space is difficult terrain.Until the spell ends, you can use a bonus action on " +
                "each of your turns to cause a bolt of lightning to leap from the center of the sphere toward one " +
                "creature you choose within 60 feet of the center. Make a ranged spell attack. You have advantage on " +
                "the attack roll if the target is in the sphere. On a hit, the target takes 4d6 lightning damage" +
                ".Creatures within 30 feet of the sphere have disadvantage on Wisdom (Perception) checks made to " +
                "listen.";
        higherLevels = "When you cast this spell using a spell slot of 5th level or higher, the damage increases for " +
                "each of its effects by 1d6 for each slot level above 4th.";
    }

}
