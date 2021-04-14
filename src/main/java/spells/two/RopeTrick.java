package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class RopeTrick extends Spell {

    public RopeTrick() {
        name = "Rope Trick";
        level = 2;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "powdered corn extract and a twisted loop of parchment";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        ritual = false;
        description = "You touch a length of rope that is up to 60 feet long. One end of the rope then rises into the" +
                " air until the whole rope hangs perpendicular to the ground. At the upper end of the rope, an " +
                "invisible entrance opens to an extradimensional space that lasts until the spell ends.The " +
                "extradimensional space can be reached by climbing to the top of the rope. The space can hold as many" +
                " as eight Medium or smaller creatures. The rope can be pulled into the space, making the rope " +
                "disappear from view outside the space.Attacks and spells can't cross through the entrance into or " +
                "out of the extradimensional space, but those inside can see out of it as if through a " +
                "3-foot-by-5-foot window centered on the rope.Anything inside the extradimensional space drops out " +
                "when the spell ends.";
    }

}
