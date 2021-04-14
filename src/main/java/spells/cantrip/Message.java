package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Message extends Spell {

    public Message() {
        name = "Message";
        level = 0;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a short piece of copper wire";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(1, TimeUnits.ROUND);
        range = new Range(120);
        ritual = false;
        description = "You point your finger toward a creature within range and whisper a message. The target (and " +
                "only the target) hears the message and can reply in a whisper that only you can hear.You can cast " +
                "this spell through solid objects if you are familiar with the target and know it is beyond the " +
                "barrier. Magical silence, 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet " +
                "of wood blocks the spell. The spell doesn't have to follow a straight line and can travel freely " +
                "around corners or through openings.";
    }

}
