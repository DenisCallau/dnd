package spells.nine;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MeteorSwarm extends Spell {

    public MeteorSwarm() {
        name = "Meteor Swarm";
        level = 9;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(mile, DistanceUnits.MILE);
        target = new Target(Aberbo);
        ritual = false;
        description = "Blazing orbs of fire plummet to the ground at four different points you can see within range. " +
                "Each creature in a 40-foot-radius sphere centered on each point you choose must make a Dexterity " +
                "saving throw. The sphere spreads around corners. A creature takes 20d6 fire damage and 20d6 " +
                "bludgeoning damage on a failed save, or half as much damage on a successful one. A creature in the " +
                "area of more than one fiery burst is affected only once.The spell damages objects in the area and " +
                "ignites flammable objects that aren't being worn or carried.";
    }

}
