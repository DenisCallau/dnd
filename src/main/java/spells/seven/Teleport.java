package spells.seven;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Teleport extends Spell {

    public Teleport() {
        name = "Teleport";
        level = 7;
        school = Schools.CONJURATION;
        components = new Components[]{
                Components.VERBAL,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(10);
        target = new Target(Aberbo);
        ritual = false;
        description = "This spell instantly transports you and up to eight willing creatures of your choice that you can see within range, or a single object, that you can see within range, to a destination you select. If you target an object, it must be able to fit entirely inside a 10-foot cube, and it can't be held or carried by an unwilling creature.The destination you choose must be known to you, and it must be on the same plane of existence as you. Your familiarity with the destination determines whether you arrive there successfully. The DM rolls d100 and consults the table.| Familiarity       | Mishap | Simliar Area | Off Target | On Target ||-------------------|--------|--------------|------------|-----------|| Permanent circle  |  ---   |      ---     |     ---    |   01-100  || Associated object |  ---   |      ---     |     ---    |   01-100  || Very familiar     | 01-05  |     06-13    |    14-24   |   25-100  || Seen casually     | 01-33  |     34-43    |    44-53   |   54-100  || Viewed once       | 01-43  |     44-53    |    54-73   |   74-100  || Description       | 01-43  |     44-53    |    54-73   |   74-100  || False destination | 01-50  |    51-100    |     ---    |    ---    |"Very familiar" is a place you have been very often, a place you have carefully studied, or a place you can see when you cast the spell. "Seen casually" is someplace you have seen more than once but with which you aren't very familiar. "Viewed once" is a place you have seen once, possibly using magic. "Description" is a place whose location and appearance you know through someone else's description, perhaps from a map."False destination" is a place that doesn't exist. Perhaps you tried to scry an enemy's sanctum but instead view an illusion, or you were attempting to teleport to a familiar location that no longer exists.";
    }

}
