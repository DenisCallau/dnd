package spells.eight;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class HolyAura extends Spell {

    public HolyAura() {
        name = "Holy Aura";
        level = 8;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a tiny reliquary worth at least 1,000 gp containing a sacred relic, such as a scrap of cloth from" +
                " a saint's robe or a piece of parchment from a religious text";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "Divine light washes out from you and coalesces in a soft radiance in a 30-foot radius around " +
                "you. Creatures of your choice in that radius when you cast this spell shed dim light in a 5-foot " +
                "radius and have advantage on all saving throws, and other creatures have disadvantage on attack " +
                "rolls against them until the spell ends. In addition, when a fiend or an undead hits an affected " +
                "creature with a melee attack, the aura flashes with brilliant light. The attacker must succeed on a " +
                "Constitution saving throw or be blinded until the spell ends.";
    }

}
