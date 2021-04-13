package spells.eight;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Glibness extends Spell {

    public Glibness() {
        name = "Glibness";
        level = 8;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "Until the spell ends, when you make a Charisma check, you can replace the number you roll with" +
                " a 15. Additionally, no matter what you say, magic that would determine if you are telling the truth" +
                " indicates that you are being truthful.";
    }

}
