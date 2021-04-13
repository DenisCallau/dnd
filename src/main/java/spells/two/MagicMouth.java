package spells.two;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MagicMouth extends Spell {

    public MagicMouth() {
        name = "Magic Mouth";
        level = 2;
        school = Schools.ILLUSION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a small bit of honeycomb and jade dust worth at least 10 gp, which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = true;
        description = "You implant a message within an object in range, a message that is uttered when a trigger condition is met. Choose an object that you can see that isn't being worn or carried by another creature, then speak the message, which must be 25 words or less, though it can be delivered over as long as ten minutes. Finally, determine the circumstance that will trigger the spell to deliver your message.When that circumstance occurs, a magical mouth appears on the object and recites the message in your voice at the same volume you spoke. If the object you chose has a mouth or something that looks like a mouth (for example, the mouth of a statue) the magical mouth appears there so that the words appear to come from the object's mouth. When you cast this spell, you can have the spell end after it delivers its message or it can remain and repeat its message whenever the trigger occurs.The triggering circumstance can be as general or as detailed as you like, though it must be based on visual or audible conditions that occur within 30 feet of the object. For example, you could instruct the mouth to speak when any creature moves within 30 feet of the object or when a silver bell rings within 30 feet.";
    }

}
