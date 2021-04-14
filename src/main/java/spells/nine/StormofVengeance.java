package spells.nine;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class StormofVengeance extends Spell {

    public StormofVengeance() {
        name = "Storm of Vengeance";
        level = 9;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
//TODO: Check Range
        ritual = false;
        description = "A churning storm cloud forms, centered on a point you can see and spreading to a radius of 360" +
                " feet. Lightning flashes in the area, thunder booms, and strong winds roar. Each creature under the " +
                "cloud (no more than 5,000 feet beneath the cloud) when it appears must make a Constitution saving " +
                "throw. On a failed save, a creature takes 2d6 thunder damage and becomes deafened for 5 minutes.Each" +
                " round you maintain concentration on this spell, the storm produces additional effects on your turn.";
    }

}
