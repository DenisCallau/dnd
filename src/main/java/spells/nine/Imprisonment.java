package spells.nine;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Imprisonment extends Spell {

    public Imprisonment() {
        name = "Imprisonment";
        level = 9;
        school = Schools.ABJURATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a vellum depiction or a carved statuette in the likeness of the target, and a special component that varies according to the version of the spell you choose, worth at least 500 gb per Hit Die of the target";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create a magical restraint to hold a creature that you can see within range. The target must succeed on a Wisdom saving throw or be bound by the spell; if it succeeds, it is immune to this spell if you cast it again. While affected by this spell, the creature doesn't need to breathe, eat, or drink, and it doesn't age. Divination spells can't locate or perceive the target.When you cast the spell, you choose one of the following forms of imprisonment.The special component for this version of the spell is a small mithral orb.The special component for this version of the spell is a fine chain of precious metal.The special component for this version of the spell is a miniature representation of the prison made from jade.The special component for this version of the spell is a large, transparent gemstone, such as a corundum, diamond, or ruby.A _dispel magic_ spell can end the spell only if it is cast as a 9th-level spell, targeting either the prison or the special component used to create it.You can use a particular special component to create only one prison at a time. If you cast the spell again using the same component, the target of the first casting is immediately freed from its binding.";
    }

}
