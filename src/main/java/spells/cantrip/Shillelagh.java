package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Shillelagh extends Spell {

    public Shillelagh() {
        name = "Shillelagh";
        level = 0;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "mistletoe, a shamrock leaf, and a club or quarterstaff";
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        ritual = false;
        description = "The wood of a club or a quarterstaff you are holding is imbued with nature's power. For the " +
                "duration, you can use your spellcasting ability instead of Strength for the attack and damage rolls " +
                "of melee attacks using that weapon, and the weapon's damage die becomes a d8. The weapon also " +
                "becomes magical, if it isn't already. The spell ends if you cast it again or if you let go of the " +
                "weapon.";
    }

}
