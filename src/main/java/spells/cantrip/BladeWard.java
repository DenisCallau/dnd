package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class BladeWard extends Spell {

    public BladeWard() {
        name = "Blade Ward";
        level = 0;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(1, TimeUnits.ROUND);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "You extend your hand and trace a sigil of warding in the air. Until the end of your next turn," +
                " you have resistance against bludgeoning, piercing, and slashing damage dealt by weapon attacks.";
    }

}
