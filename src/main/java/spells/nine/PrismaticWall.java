package spells.nine;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class PrismaticWall extends Spell {

    public PrismaticWall() {
        name = "Prismatic Wall";
        level = 9;
        school = Schools.ABJURATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "A shimmering, multicolored plane of light forms a vertical opaque wall--up to 90 feet long, 30 feet high, and 1 inch thick--centered on a point you can see within range. Alternatively, you can shape the wall into a sphere up to 30 feet in diameter centered on a point you choose within range. The wall remains in place for the duration. If you position the wall so that it passes through a space occupied by a creature, the spell fails, and your action and the spell slot are wasted.The wall sheds bright light out to a range of 100 feet and dim light for an additional 100 feet. You and creatures you designate at the time you cast the spell can pass through and remain near the wall without harm. If another creature that can see the wall moves to within 20 feet of it or starts its turn there, the creature must succeed on a Constitution saving throw or become blinded for 1 minute.The wall consists of seven layers, each with a different color. When a creature attempts to reach into or pass through the wall, it does so one layer at a time through all thew wall's layers. As it passes or reaches through each layer, the creature must make a Dexterity saving throw or be affected by that layer's properties as described below.The wall can be destroyed, also one layer at a time, in order from red to violet, by means specific to each layer. Once a layer is destroyed it remains so for the duration of the spell. A _rod of cancellation_ destroys a _prismatic wall_, but an _antimagic_ field has no effect on it.While this layer is in place, spells can't be cast through the wall. The laer is destoryed by bright light shed by a _daylight_ spell or a similar spell of equal or higher level.";
    }

}
