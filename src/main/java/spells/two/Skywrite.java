package spells.two;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Skywrite extends Spell {

    public Skywrite() {
        name = "Skywrite";
        level = 2;
        school = Schools.TRANSMUTATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
//TODO: Check Range
        target = new Target(Aberbo);
        ritual = true;
        description = "You cause up to ten words to form in a part of the sky you can see. The words appear to be made of cloud and remain in place for the spell�s duration. The words dissipate when the spell ends. A strong wind can disperse the clouds and end the spell early";
    }

}
