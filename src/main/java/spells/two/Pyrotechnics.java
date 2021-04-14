package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Pyrotechnics extends Spell {

    public Pyrotechnics() {
        name = "Pyrotechnics";
        level = 2;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        ritual = false;
        description = "Choose an area of flame that you can see and that can fit within a 5-foot cube within range. " +
                "You can extinguish the fire in that area, and you create either fireworks or smoke.";
    }

}
