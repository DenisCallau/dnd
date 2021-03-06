package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FleshtoStone extends Spell {

    public FleshtoStone() {
        name = "Flesh to Stone";
        level = 6;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a pinch of lime, water, and earth";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(60);
        ritual = false;
        description = "You attempt to turn one creature that you can see within range into stone. If the target's " +
                "body is made of flesh, the creature must make a Constitution saving throw. On a failed save, it is " +
                "restrained as its flesh begins to harden. On a successful save, the creature isn't affected.A " +
                "creature restrained by this spell must make another Consititution saving throw at the end of each of" +
                " its turns. If it successfully saves against this spell three times, the spell ends. If it fails " +
                "saves three times, it is turned to stone and subjected to the petrified condition for the duration. " +
                "The successes and failures don't need to be consecutive; keep track of both until the target " +
                "collects three of a kind.If the creature is physically broken while petrified, it suffers from " +
                "similar deformities if it reverts to its original state.If you maintain your concentration on this " +
                "spell for the entire possible duration, the creature is turned to stone until the effect is removed.";
    }

}
