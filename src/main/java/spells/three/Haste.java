package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Haste extends Spell {

    public Haste() {
        name = "Haste";
        level = 3;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a shaving of licorice root";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(30);
        target = new Target(Aberbo);
        ritual = false;
        description = "Choose a willing creature that you can see within range. Until the spell ends, the target’s " +
                "speed is doubled, it gains a +2 bonus to AC, it has advantage on Dexterity saving throws, and it " +
                "gains an additional action on each of its turns. That action can be used only to take the Attack " +
                "(one weapon attack only), Dash, Disengage, Hide, or Use an Object action.When the spell ends, the " +
                "target can’t move or take actions until after its next turn, as a wave of lethargy sweeps over it.";
    }

}
