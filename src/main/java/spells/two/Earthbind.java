package spells.two;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Earthbind extends Spell {

    public Earthbind() {
        name = "Earthbind";
        level = 2;
        school = Schools.TRANSMUTATION;
        components = new Components[]{
                Components.VERBAL,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(300);
        target = new Target(Aberbo);
        ritual = false;
        description = "Choose one creature you can see within range. Yellow strips of magical energy loop around the creature. The target must succeed on a Strength saving throw or its flying speed (if any) is reduced to 0 feet for the spell�s duration. An airborne creature affected by this spell descends at 60 feet per round until it reaches the ground or the spell ends.";
    }

}
