package spells.three;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Revivify extends Spell {

    public Revivify() {
        name = "Revivify";
        level = 3;
        school = Schools.CONJURATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "diamonds worth 300 gp, which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You touch a creature that has died within the last minute. That creature returns to life with 1 hit point. This spell can�t return to life a creature that has died of old age, nor can it restore any missing body parts.";
    }

}
