package spells.cantrip;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Prestidigitation extends Spell {

    public Prestidigitation() {
        name = "Prestidigitation";
        level = 0;
        school = Schools.TRANSMUTATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(10);
        target = new Target(Aberbo);
        ritual = false;
        description = "* You create an instantaneous, harmless sensory effect, such as a shower of sparks, a puff of wind, faint musical notes, or an odd odor.* You instantaneously light or snuff out a candle, a torch, or a small campfire.* You instantaneously clean or soil an object no larger than 1 cubic foot.* You chill, warm, or flavor up to 1 cubic foot of nonliving material for 1 hour.* You make a color, a small mark, or a symbol appear on an object or a surface for 1 hour.* You create a nonmagical trinket or an illusory image that can fit in your hand and that lasts until the end of your next turn.If you cast this spell multiple times, you can have up to three of its non-instantaneous effects active at a time, and you can dismiss such an effect as an action.";
    }

}
