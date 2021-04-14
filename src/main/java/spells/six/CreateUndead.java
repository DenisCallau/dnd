package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class CreateUndead extends Spell {

    public CreateUndead() {
        name = "Create Undead";
        level = 6;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "one clay pot filled with grave dirt, one clay pot filled with brackish water, and one 150 gp " +
                "black onyx stone for each corpse";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(10);
        ritual = false;
        description = "You can cast this spell only at night. Choose up to three corpses of Medium or Small humanoids" +
                " within range. Each corpse becomes a ghoul under your control. (The DM has game statistics for these" +
                " creatures.)As a bonus action on each of your turns, you can mentally command any creature you " +
                "animated with this spell if the creature is within 120 feet of you (if you control multiple " +
                "creatures, you can command any or all of them at the same time, issuing the same command to each " +
                "one). You decide what action the creature will take and where it will move during its next turn, or " +
                "you can issue a general command, such as to guard a particular chamber or corridor. If you issue no " +
                "commands, the creature only defends itself against hostile creatures. Once given an order, the " +
                "creature continues to follow it until its task is complete.The creature is under your control for 24" +
                " hours, after which it stops obeying any command you have given it. To maintain control of the " +
                "creature for another 24 hours, you must cast this spell on the creature before the current 24-hour " +
                "period ends. This use of the spell reasserts your control over up to three creatures you have " +
                "animated with this spell, rather than animating new ones.";
        higherLevels = "When you cast this spell using a 7th-level spell slot, you can animate or reassert control " +
                "over four ghouls. When you cast this spell using an 8th-level spell slot, you can animate or " +
                "reassert control over five ghouls or two ghasts or wights. When you cast this spell using a " +
                "9th-level spell slot, you can animate or reassert control over six ghouls, three ghasts or wights, " +
                "or two mummies.";
    }

}
