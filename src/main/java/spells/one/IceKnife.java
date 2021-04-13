package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class IceKnife extends Spell {

    public IceKnife() {
        name = "Ice Knife";
        level = 1;
        school = Schools.CONJURATION;
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a drop of water or piece of ice";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create a shard of ice and fling it at one creature within range. Make a ranged spell " +
                "attack against the target. On a hit, the target takes 1d10 piercing damage. Hit or miss, the shard " +
                "then explodes. The target and each creature within 5 feet of the point where the ice exploded must " +
                "succeed on a Dexterity saving throw or take 2d6 cold damage.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, the cold damage increases" +
                " by 1d6 for each slot level above 1st.";
    }

}
