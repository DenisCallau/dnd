package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class LegendLore extends Spell {

    public LegendLore() {
        name = "Legend Lore";
        level = 5;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "incense worth at least 250 gp, which the spell consumes, and four ivory strips worth at least 50 " +
                "gp each";
        castingTime = new CastingTime(10, TimeUnits.MINUTE);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "Name or describe a person, place, or object. The spell brings to your mind a brief summary of " +
                "the significant lore about the thing you named. The lore might consist of current tales, forgotten " +
                "stories, or even secret lore that has never been widely known. If the thing you named isn't of " +
                "legendary importance, you gain no information. The more information you already have about the " +
                "thing, the more precise and detailed the information you receive is.";
    }

}
