package spells.two;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class WardingWind extends Spell {

    public WardingWind() {
        name = "Warding Wind";
        level = 2;
        school = Schools.EVOCATION;
        components = new Components[]{
                Components.VERBAL,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "A strong wind (20 miles per hour) blows around you in a 10-foot radius and moves with you, remaining centered on you. The wind lasts for the spell�s duration.* It deafens you and other creatures in its area.* It extinguishes unprotected flames in its area that are torch-sized or smaller.* The area is difficult terrain for creatures other than you.* The attack rolls of ranged weapon attacks have disadvantage if they pass in or out of the wind.* It hedges out vapor, gas, and fog that can be dispersed by strong wind.";
    }

}
