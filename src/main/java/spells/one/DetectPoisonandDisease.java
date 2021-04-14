package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class DetectPoisonandDisease extends Spell {

    public DetectPoisonandDisease() {
        name = "Detect Poison and Disease";
        level = 1;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a yew leaf";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        ritual = true;
        description = "For the duration, you can sense the presence and location of poisons, poisonous creatures, and" +
                " diseases within 30 feet of you. You also identify the kind of poison, poisonous creature, or " +
                "disease in each case.The spell can penetrate most barriers, but it is blocked by 1 foot of stone, 1 " +
                "inch of common metal, a thin sheet of lead, or 3 feet of wood or dirt.";
    }

}
