package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class DetectMagic extends Spell {

    public DetectMagic() {
        name = "Detect Magic";
        level = 1;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        ritual = true;
        description = "For the duration, you sense the presence of magic within 30 feet of you. If you sense magic in" +
                " this way, you can use your action to see a faint aura around any visible creature or object in the " +
                "area that bears magic, and you learn its school of magic, if any.The spell can penetrate most " +
                "barriers, but it is blocked by 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or 3 " +
                "feet of wood or dirt.";
    }

}
