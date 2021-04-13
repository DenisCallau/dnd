package spells.two;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Barkskin extends Spell {

    public Barkskin() {
        name = "Barkskin";
        level = 2;
        school = Schools.TRANSMUTATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a handful of oak bark";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You touch a willing creature. Until the spell ends, the target�s skin has a rough, bark-like appearance, and the target�s AC can�t be less than 16, regardless of what kind of armor it is wearing.";
    }

}
