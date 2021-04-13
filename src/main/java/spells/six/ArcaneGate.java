package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ArcaneGate extends Spell {

    public ArcaneGate() {
        name = "Arcane Gate";
        level = 6;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(500);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create linked teleportation portals that remain open for the duration. Choose two points " +
                "on the ground that you can see, one point within 10 feet of you and one point within 500 feet of you" +
                ". A circular portal, 10 feet in diameter, opens over each point. If the portal would open in the " +
                "space occupied by a creature, the spell fails, and the casting is lost.The portals are " +
                "two-dimensional glowing rings filled with mist, hovering inches from the ground and perpendicular to" +
                " it at the points you choose. A ring is visible only from one side (your choice), which is the side " +
                "that functions as a portal.Any creature or object entering the portal exits from the other portal as" +
                " if the two were adjacent to each other; passing through a portal from the nonportal side has no " +
                "effect. The mist that fills each portal is opaque and blocks vision through it. On your turn, you " +
                "can rotate the rings as a bonus action so that the active side faces in a different direction.";
    }

}
