package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Forbiddance extends Spell {

    public Forbiddance() {
        name = "Forbiddance";
        level = 6;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a sprinkling of holy water, rare incense, and powdered ruby worth at least 1000 gp";
        castingTime = new CastingTime(10, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = true;
        description = "You create a ward against magical travel that protects up to 40,000 square feet of floor space" +
                " to a height of 30 feet above the floor. For the duration, creatures can't teleport into the area or" +
                " use portals, such as those created by the *[gate](../gate/ 'gate (lvl 9)')* spell, to enter the " +
                "area. The spell proofs the area against planar travel, and therefore prevents creatures from " +
                "accessing the area by way of the Astral Plane, Ethereal Plane, Feywild, Shadowfell, or the *[plane " +
                "shift](../plane-shift/ 'plane shift (lvl 7)')* spell.When you cast this spell, you can designate a " +
                "password. A creature that speaks the password as it enters the area takes no damage from the spell" +
                ".The spell's area can't overlap with the area of another *forbiddance* spell. If you cast " +
                "*forbiddance* every day for 30 days in the same location, the spell lasts until it is dispelled, and" +
                " the material components are consumed on the last casting.";
    }

}
