package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ArcaneLock extends Spell {

    public ArcaneLock() {
        name = "Arcane Lock";
        level = 2;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "gold dust w orth at least 25 gp, which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You touch a closed door, window, gate, chest, or other entryway, and it becomes locked for the" +
                " duration. You and the creatures you designate when you cast this spell can open the object normally" +
                ". You can also set a password that, when spoken within 5 feet of the object, suppresses this spell " +
                "for 1 minute. Otherwise, it is impassable until it is broken or the spell is dispelled or suppressed" +
                ". Casting knock on the object suppresses arcane lock for 10 minutes.While affected by this spell, " +
                "the object is more difficult to break or force open; the DC to break it or pick any locks on it " +
                "increases by 10.";
    }

}
