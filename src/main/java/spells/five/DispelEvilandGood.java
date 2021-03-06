package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class DispelEvilandGood extends Spell {

    public DispelEvilandGood() {
        name = "Dispel Evil and Good";
        level = 5;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "holy water or powdered silver and iron";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "Shimmering energy surrounds and protects you from fey, undead, and creatures originating from " +
                "beyond the Material Plane. For the duration, celestials, elementals, fey, fiends, and undead have " +
                "disadvantage on attack rolls against you.You can end the spell early by using either of the " +
                "following special functions.";
    }

}
