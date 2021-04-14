package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Commune extends Spell {

    public Commune() {
        name = "Commune";
        level = 5;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "incense and a vial of holy or unholy water";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(constants.Target.SELF);
        ritual = true;
        description = "You contact your deity or a divine proxy and ask up to three questions that can be answered " +
                "with a yes or no. You must ask your questions before the spell ends. You receive a correct answer " +
                "for each question.Divine beings aren't necessarily omniscient, so you might receive 'unclear' as an " +
                "answer if a question pertains to information that lies beyond the deity's knowledge. In a case where" +
                " a one-word answer could be misleading or contrary to the deity's interests, the DM might offer a " +
                "short phrase as an answer instead.If you cast the spell two or more times before finishing your next" +
                " long rest, there is a cumulative 25 percent chance for each casting after the first that you get no" +
                " answer. The DM makes this roll in secret.";
    }

}
