package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Druidcraft extends Spell {

    public Druidcraft() {
        name = "Druidcraft";
        level = 0;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "* You create a tiny, harmless sensory effect that predicts what the weather will be at your " +
                "location for the next 24 hours. The effect might manifest as a golden orb for clear skies, a cloud " +
                "for rain, falling snowflakes for snow, and so on. This effect persists for 1 round.* You instantly " +
                "make a flower bloom, a seed pod open, or a leaf bud bloom.* You create an instantenous, harmless " +
                "sensory effect, such as falling leaves, a puff of wind, the sound of a small animal, or the faint " +
                "order of skunk. The effect must fit in a 5-foot cube.* You instantly light or snuff out a candle, a " +
                "torch, or a small campfire.";
    }

}
