package spells.three;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class EruptingEarth extends Spell {

    public EruptingEarth() {
        name = "Erupting Earth";
        level = 3;
        school = Schools.TRANSMUTATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "a piece of obsidian";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(120);
        target = new Target(Aberbo);
        ritual = false;
        description = "Choose a point you can see on the ground within range. A fountain of churned earth and stone erupts in a 20-foot cube centered on that point. Each creature in that area must make a Dexterity saving throw. A creature takes 3d12 bludgeoning damage on a failed save, or half as much damage on a successful one. Additionally, the ground in that area becomes difficult terrain until cleared away. Each 5-foot-square portion of the area requires at least 1 minute to clear by hand.";
        higherLevels = "When you cast this spell using a spell slot of 3rd level or higher, the damage increases by 1d12 for each slot level above 2nd.";
    }

}
