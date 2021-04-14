package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Hex extends Spell {

    public Hex() {
        name = "Hex";
        level = 1;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "the petrified eye of a newt";
        castingTime = new CastingTime(1, TimeUnits.BONUS_ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(90);
        ritual = false;
        description = "You place a curse on a creature that you can see within range. Until the spell ends, you deal " +
                "an extra 1d6 necrotic damage to the target whenever you hit it with an attack. Also choose one " +
                "ability when you cast the spell. The target has disadvantage on ability checks made with the chosen " +
                "ability.If the target drops to 0 hit points before this spell ends, you can use a bonus action on a " +
                "subsequent turn of yours to curse a new creature.A *[remove curse](../remove-curse/)* cast on the " +
                "target ends this spell early.";
        higherLevels = "When you cast this spell using a spell slot of 3rd or 4th level, you can maintain your " +
                "concentration on the spell for up to 8 hours. When you use a spell slot of 5th level or higher, you " +
                "can maintain your concentration on the spell for up to 24 hours.";
    }

}
