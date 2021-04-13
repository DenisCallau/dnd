package spells.nine;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Gate extends Spell {

    public Gate() {
        name = "Gate";
        level = 9;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a diamond worth at least 5,000 gp";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "You conjure a portal linking an unoccupied space you can see whithin range to a precise " +
                "location on a different plane of existence. The portal is a circular opening, which you can make 5 " +
                "to 20 feet in diameter. You can orient the portal in any direction you choose. The portal lasts for " +
                "the duration.The portal has a front and a back on each plane where it appears. Travel through the " +
                "portal is possible only by moving through its front. Anything that does so is instantly transported " +
                "to the other plane, appearing in the unoccupied space nearest to the portal.Deities and other planar" +
                " rulers can prevent portals created by this spell from opening in their presence or anywhere within " +
                "their domains.When you cast this spell, you can speak the name of a specific creature (a pseudonym, " +
                "title or nickname doesn't work). If that creature is on a plane other than the one you are on, the " +
                "portal opens in the named creature's immediate vicinity and draws the creature through it to the " +
                "nearest unoccupied space on your side of the portal. You gain no special power over the creature, " +
                "and it is free to act as the DM deems appropriate. It might leave, attack you or help you.";
    }

}
