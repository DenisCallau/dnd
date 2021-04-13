package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class SpeakwithAnimals extends Spell {

    public SpeakwithAnimals() {
        name = "Speak with Animals";
        level = 1;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = true;
        description = "You gain the ability to comprehend and verbally communicate with beasts for the duration. The " +
                "knowledge and awareness of many beasts is limited by their intelligence, but at a minimum, beasts " +
                "can give you information about nearby locations and monsters, including whatever they can perceive " +
                "or have perceived within the past day. You might be able to persuade a beast to perform a small " +
                "favor for you, at the DM's discretion.";
    }

}
