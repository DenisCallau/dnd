package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class SpeakwithDead extends Spell {

    public SpeakwithDead() {
        name = "Speak with Dead";
        level = 3;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "burning incense";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(10);
        target = new Target(Aberbo);
        ritual = false;
        description = "You grant the semblance o f life and intelligence to a corpse of your choice within range, " +
                "allowing it to answer the questions you pose. The corpse must still have a mouth and can’t be undead" +
                ". The spell fails if the corpse was the target o f this spell within the last 10 days.Until the " +
                "spell ends, you can ask the corpse up to five questions. The corpse knows only what it knew in life," +
                " including the languages it knew. Answers are usually brief, cryptic, or repetitive, and the corpse " +
                "is under no compulsion to offer a truthful answer if you are hostile to it or it recognizes you as " +
                "an enemy. This spell doesn’t return the creature’s soul to its body, only its animating spirit. " +
                "Thus, the corpse can’t learn new information, doesn’t comprehend anything that has happened since it" +
                " died, and can’t speculate about future events.";
    }

}
