package spells.cantrip;

import constants.DistanceUnits;
import constants.Target;
import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class BladeWard extends Spell {

    public BladeWard() {
        name = "Blade Ward";
        level = 0;
        school = Schools.ABJURATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(1, TimeUnits.ROUND);
        range = new Range(Target.SELF);
        target = new helpers.Target(Target.SELF);
        ritual = false;
        description = "You extend your hand and trace a sigil of warding in the air. Until the end of your next turn, you have resistance against bludgeoning, piercing, and slashing damage dealt by weapon attacks.";
    }

}
