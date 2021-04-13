package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ContactOtherPlane extends Spell {

    public ContactOtherPlane() {
        name = "Contact Other Plane";
        level = 5;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = true;
        description = "You mentally contact a demigod, the spirit of a long-dead sage, or some other mysterious " +
                "entity from another plane. Contacting this extraplanar intelligence can strain or even break your " +
                "mind. When you cast this spell, make a DC 15 Intelligence saving throw. On a failure, you take 6d6 " +
                "psychic damage and are insane until you finish a long rest. While insane, you can't take actions, " +
                "can't understand what other creatures say, can't read, and speak only in gibberish. A *[greater " +
                "restoration](../greater-restoration 'greater restoration (lvl 5)')* spell cast on you ends this " +
                "effect.On a successful save, you can ask the entity up to five questions. You must ask your " +
                "questions before the spell ends. The DM answers each question with one word, such as 'yes,' 'no,' " +
                "'maybe,' 'never,' 'irrelevant,' or 'unclear' (if the entity doesn't know the answer to the question)" +
                ". If a one-word answer would be misleading, the DM might instead offer a short phrase as an answer.";
    }

}
