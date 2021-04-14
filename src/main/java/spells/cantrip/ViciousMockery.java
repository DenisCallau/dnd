package spells.cantrip;

import constants.TimeUnits;
import helpers.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ViciousMockery extends Spell {

    public ViciousMockery() {
        name = "Vicious Mockery";
        level = 0;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        ritual = false;
        description = "You unleash a string of insults laced with subtle enchantments at a creature you can see within range. If the target can hear you (though it need not understand you), it must succeed on a Wisdom saving throw or take 1d4 psychic damage and have disadvantage on the next attack roll it makes before the end of its next turn.This spell's damage increases by 1d4 when you reach 5th level (2d4), 11th level (3d4), and 17th level (4d4).";
    }

}
