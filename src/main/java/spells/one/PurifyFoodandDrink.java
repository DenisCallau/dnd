package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class PurifyFoodandDrink extends Spell {

    public PurifyFoodandDrink() {
        name = "Purify Food and Drink";
        level = 1;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(10);
        target = new Target(Aberbo);
        ritual = false;
        description = "All nonmagical food and drink within a 5-foot radius sphere centered on a point of your choice" +
                " within range is purified and rendered free of poison and disease.";
    }

}
