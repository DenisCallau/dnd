package spells.three;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class GaseousForm extends Spell {

    public GaseousForm() {
        name = "Gaseous Form";
        level = 3;
        school = Schools.TRANSMUTATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a bit of gauze and a wisp of smoke";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You transform a willing creature you touch, along with everything it�s wearing and carrying, into a misty cloud for the duration. The spell ends if the creature drops to 0 hit points. An incorporeal creature isn�t affected.While in this form, the target�s only method of movement is a flying speed of 10 feet. The target can enter and occupy the space of another creature. The target has resistance to nonmagical damage, and it has advantage on Strength, Dexterity, and Constitution saving throws. The target can pass through small holes, narrow openings, and even mere cracks, though it treats liquids as though they were solid surfaces. The target can't fall and remains hovering in the air even when stunned or otherwise incapacitated.While in the form of a misty cloud, the target can�t talk or manipulate objects, and any objects it w as carrying or holding can�t be dropped, used, or otherwise interacted with. The target can�t attack or cast spells.";
    }

}
