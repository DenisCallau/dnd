package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MageArmor extends Spell {

    public MageArmor() {
        name = "Mage Armor";
        level = 1;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a piece of cured leather";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(0);
        ritual = false;
        description = "You touch a willing creature who isn’t wearing armor, and a protective magical force surrounds" +
                " it until the spell ends. The target’s base AC becomes 13 + its Dexterity modifier. The spell ends " +
                "if the target dons armor or if you dismiss the spell as an action.";
    }

}
