package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Passwall extends Spell {

    public Passwall() {
        name = "Passwall";
        level = 5;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a pinch of sesame seeds";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "When the opening disappears, any creatures or objects still in the passage created by the " +
                "spell are safely ejected to an unoccupied space nearest to the surface on which you cast the spell.";
    }

}
