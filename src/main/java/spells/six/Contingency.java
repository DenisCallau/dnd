package spells.six;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Contingency extends Spell {

    public Contingency() {
        name = "Contingency";
        level = 6;
        school = Schools.EVOCATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a statuette of yourself carved from ivory and decorated with gems worth at least 1,500 gp";
        castingTime = new CastingTime(10, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "Choose a spell of 5th level or lower that you can cast, that has a casting time of 1 action, and that can target you. You cast that spell--called the contingent spell--as part of casting *contingency*, expending spell slots for both, but the contingent spell doesn't come into effect. Instead, it takes effect when a certain circumstance occurs. You describe that circumstance when you cast the two spells. For example, a *contingency* cast with *[water breathing](../water-breathing/ "water breathing (lvl 3)")* might stipulate that *water breathing* comes into effect when you are engulfed in water or a similar liquid.The contingent spell takes effect immediately after the circumstance is met for the first time, whether or not you want it to. and then contingency ends.The contingent spell takes effect only on you, even if it can normally target others. You can use only one *contingency* spell at a time. If you cast this spell again, the effect of another *contingency* spell on you ends. Also, *contingency* ends on you if its material component is ever not on your person.";
    }

}
