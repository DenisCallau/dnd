package spells.five;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class TeleportationCircle extends Spell {

    public TeleportationCircle() {
        name = "Teleportation Circle";
        level = 5;
        school = Schools.CONJURATION;
        components = new Components[]{
                Components.VERBAL,
                Components.MATERIAL
        };
        String material = "rare chalks and inks infused with precious gems with 50 gp, which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
        duration = new Duration(1, TimeUnits.ROUND);
        range = new Range(10);
        target = new Target(Aberbo);
        ritual = false;
        description = "As you cast the spell, you draw a 10-foot-diameter circle on the ground inscribed with sigils that link your location to a permanent teleportation circle of your choice, whose sigil sequence you know and that is on the same plane of existence as you. A shimmering portal opens within the circle you drew and remains open until the end of your next turn. Any creature that enters the portal instantly appears within 5 feet of the destination circle or in the nearest unoccupied space if that space is occupied.Many major temples, guilds, and other important places have permanent teleportation circles inscribed somewhere within their confines. Each such circle includes a unique sigil sequence�-a string of magical runes arranged in a particular pattern. When you first gain the ability to cast this spell, you learn the sigil sequences for two destinations on the Material Plane, determined by the DM. You can learn additional sigil sequences during your adventures. You can commit a new sigil sequence to memory after studying it for 1 minute.You can create a permanent teleportation circle by casting this spell in the same location every day for one year. You need not use the circle to teleport when you cast the spell in this way.";
    }

}
