package spells.three;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class SpeakwithPlants extends Spell {

    public SpeakwithPlants() {
        name = "Speak with Plants";
        level = 3;
        school = Schools.TRANSMUTATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "You imbue plants within 30 feet of you with limited sentience and animation, giving them the ability to communicate with you and follow your simple commands. You can question plants about events in the spell�s area within the past day, gaining information about creatures that have passed, weather, and other circumstances.You can also turn difficult terrain caused by plant growth (such as thickets and undergrowth) into ordinary terrain that lasts for the duration. Or you can turn ordinary terrain where plants are present into difficult terrain that lasts for the duration, causing v ines and branches to hinder pursuers, for example.Plants might be able to perform other tasks on your behalf, at the DM�s discretion. The spell doesn�t enable plants to uproot themselves and move about, but they can freely move branches, tendrils, and stalks.If a plant creature is in the area, you can communicate with it as if you shared a common language, but you gain no magical ability to influence it.This spell can cause the plants created by the entangle spell to release a restrained creature.";
    }

}
