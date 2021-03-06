package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Alarm extends Spell {

    public Alarm() {
        name = "Alarm";
        level = 1;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a tiny bell and a piece of fine silver wire";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(30);
        ritual = true;
        description = "You set an alarm against unwanted intrusion. Choose a door, a window, or an area within range " +
                "that is no larger than a 20-foot cube. Until the spell ends, an alarm alerts you whenever a Tiny or " +
                "larger creature touches or enters the warded area. When you cast the spell, you can designate " +
                "creatures that won't set off the alarm. You also choose whether the alarm is mental or audible.A " +
                "mental alarm alerts you with a ping in your mind if you are within 1 mile of the warded area. This " +
                "ping awakens you if you are sleeping.An audible alarm produces the sound of a hand bell for 10 " +
                "seconds within 60 feet.";
    }

}
