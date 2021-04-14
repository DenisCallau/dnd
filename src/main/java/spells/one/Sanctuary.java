package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Sanctuary extends Spell {

    public Sanctuary() {
        name = "Sanctuary";
        level = 1;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a small silver mirror";
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
//TODO: CHECK DURATION
        range = new Range(30);
        ritual = false;
        description = "You ward a creature within range against attack. Until the spell ends, any creature who " +
                "targets the warded creature with an attack or a harmful spell must first make a Wisdom saving throw." +
                " On a failed save, the creature must choose a new target or lose the attack or spell. This spell " +
                "doesn’t protect the warded creature from area effects, such as the explosion of a fireball.If the " +
                "warded creature makes an attack or casts a spell that affects an enemy creature, this spell ends.";
    }

}
