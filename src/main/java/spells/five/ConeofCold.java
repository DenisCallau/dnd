package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ConeofCold extends Spell {

    public ConeofCold() {
        name = "Cone of Cold";
        level = 5;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a small crystal or a glass cone";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "A blast of cold air erupts from your hands. Each creature in a 60-foot cone must make a " +
                "Constitution saving throw. A creature takes 8d8 cold damage on a failed save, or half as much damage" +
                " on a successful one.A creature killed by this spell becomes a frozen statue until it thaws.";
        higherLevels = "When you cast this spell using a spell slot of 6th level or higher, the damage increases by " +
                "1d8 for each slot level above 5th.";
    }

}
