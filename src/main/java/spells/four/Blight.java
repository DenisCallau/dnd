package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Blight extends Spell {

    public Blight() {
        name = "Blight";
        level = 4;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "Necromantic energy washes over a creature of your choice that you can see within range, " +
                "draining moisture and vitality from it. The target must make a Constitution saving throw. The target" +
                " takes 8d8 necrotic damage on a failed save, or half as much damage on a successful one. The spell " +
                "has no effect on undead or constructs.If you target a plant creature or a magical plant, it makes " +
                "the saving throw with disadvantage, and the spell deals maximum damage to it.If you target a " +
                "nonmagical plant that isn't a creature, such as a tree or shrub, it doesn't make a saving throw; it " +
                "simply withers and dies.";
        higherLevels = "When you cast this spell using a spell slot of 5th level of higher, the damage increases by " +
                "1d8 for each slot level above 4th.";
    }

}
