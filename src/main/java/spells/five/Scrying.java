package spells.five;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Scrying extends Spell {

    public Scrying() {
        name = "Scrying";
        level = 5;
        school = Schools.DIVINATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a focus worth at least 1,000 gp, such as a crystal ball, a silver mirror, or a font filled with holy water";
        castingTime = new CastingTime(10, TimeUnits.MINUTE);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "You can see and hear a particular creature you choose that is on the same plane of existence as you. The target must make a Wisdom saving throw, which is modified by how well you know the target and the sort of physical connection you have to it. If a target knows you're casting this spell, it can fail the saving throw voluntarily if it wants to be observed.|Knowledge|Save Modifier||---|---||Secondhand (you have heard of the target)| +5||Firsthand (you have met the target)| 0||Familiar (you know the target well)| -5||Connection|Save Modifier||Likeness or picture| -2||Possession or garment| -4||Body part, lock of hair, bit of nail, or the like| -10|On a successful save, the target isn't affected, and you can't use this spell against it again for 24 hours. On a failed save, the spell creates an invisible sensor within 10 feet of the target. You can see and hear through the sensor as if you were there. The sensor moves with the target, remaining within 10 feet of it for the duration. A creature that can see invisible objects sees the sensor as a luminous orb about the size of your fist.Instead of targeting a creature, you can choose a location you have seen before as the target of this spell. When you do, the sensor appears at that location and doesn�t move.";
    }

}
