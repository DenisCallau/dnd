package spells.one;

import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FeatherFall extends Spell {

    public FeatherFall() {
        name = "Feather Fall";
        level = 1;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.MATERIAL);
        material = "a small feather or a piece of down";
//TODO: CHECK CASTING TIME
//TODO: CHECK DURATION
        range = new Range(60);
        ritual = false;
        description = "Choose up to five falling creatures within range. A falling creature's rate of descent slows " +
                "to 60 feet per round until the spell ends. If the creature lands before the spell ends, it takes no " +
                "falling damage and can land on its feet, and the spell ends for that creature.";
    }

}
