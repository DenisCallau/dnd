package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class CommunewithNature extends Spell {

    public CommunewithNature() {
        name = "Commune with Nature";
        level = 5;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = true;
        description = "You briefly become one with nature and gain knowledge of the surrounding territory. In the " +
                "outdoors, the spell gives you knowledge of the land within 3 miles of you. In caves and other " +
                "natural underground settings, the radius is limited to 300 feet. The spell doesn't function where " +
                "nature has been replaced by construction, such as in dungeons and towns.* terrain and bodies of " +
                "water* prevalent plants, minerals, animals, or peoples* powerful celestials, fey, fiends, " +
                "elementals, or undead* influence from other planes of existence* buildingsFor example, you could " +
                "determine the location of powerful undead in the area, the location of major sources of safe " +
                "drinking water, and the location of any nearby towns.";
    }

}
