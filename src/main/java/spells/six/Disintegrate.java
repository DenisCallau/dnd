package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Disintegrate extends Spell {

    public Disintegrate() {
        name = "Disintegrate";
        level = 6;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a lodestone and a pinch of dust";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        ritual = false;
        description = "A thin green ray springs from your pointing finger to a target that you can see within range. " +
                "The target can be a creature, an object, or a creation of magical force, such as the wall created by" +
                " *[wall of force](../wall-of-force/ 'wall of force (lvl 5)')*.A creature targeted by this spell must" +
                " make a Dexterity saving throw. On a failed save, the target takes 10d6 + 40 force damage. If this " +
                "damage reduces the target to 0 hit points, it is disintegrated.A disintegrated creature and " +
                "everything it is wearing and carrying, except magic items, are reduced to a pile of fine gray dust. " +
                "The creature can be restored to life only by means of a *[true resurrection](../true-resurrection/ " +
                "'true resurrection (lvl 9)')* or a *[wish](../wish/ 'wish (lvl 9)')* spell.This spell automatically " +
                "disintegrates a Large or smaller nonmagical object or a creation of magical force. If the target is " +
                "a Huge or larger object or creation of force, this spell disintegrates a 10-foot-cube portion of it." +
                " A magic item is unaffected by this spell.";
        higherLevels = "When you cast this spell using a spell slot of 7th level or higher, the damage increases by " +
                "3d6 for each slot level above 6th.";
    }

}
