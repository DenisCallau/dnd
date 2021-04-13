package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MinorIllusion extends Spell {

    public MinorIllusion() {
        name = "Minor Illusion";
        level = 0;
        school = Schools.ILLUSION;
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a bit of fleece";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create a sound or an image of an object within range that lasts for the duration. The " +
                "illusion also ends if you dismiss it as an action or cast this spell again.If you create a sound, " +
                "its volume can range from a whisper to a scream. It can be your voice, someone else’s voice, a " +
                "lion’s roar, a beating of drums, or any other sound you choose. The sound continues unabated " +
                "throughout the duration, or you can make discrete sounds at different times before the spell ends.If" +
                " you create an image of an object—such as a chair, muddy footprints, or a small chest—it must be no " +
                "larger than a 5-foot cube. The image can’t create sound, light, smell, or any other sensory effect. " +
                "Physical interaction with the image reveals it to be an illusion, because things can pass through it" +
                ".If a creature uses its action to examine the sound or image, the creature can determine that it is " +
                "an illusion with a successful Intelligence (Investigation) check against your spell save DC. If a " +
                "creature discerns the illusion for what it is, the illusion becomes faint to the creature.";
    }

}
