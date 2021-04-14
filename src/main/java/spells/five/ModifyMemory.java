package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ModifyMemory extends Spell {

    public ModifyMemory() {
        name = "Modify Memory";
        level = 5;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(30);
        ritual = false;
        description = "You attempt to reshape another creature's memories. One creature that you can see must make a " +
                "Wisdom saving throw. If you are fighting the creature, it has advantage on the saving throw. On a " +
                "failed save, the target becomes charmed by you for the duration. The charmed target is incapacitated" +
                " and unaware of its surroundings, though it can still hear you. If it takes any damage or is " +
                "targeted by another spell, this spell ends, and none of the target's memories are modified.While " +
                "this charm lasts, you can affect the target's memory of an event that it experienced within the last" +
                " 24 hours and that lasted no more than 10 minutes. You can permanently eliminate all memory of the " +
                "event, allow the target to recall the event with perfect clarity and exacting detail, change its " +
                "memory of the details of the event, or create a memory of some other event.You must speak to the " +
                "target to describe how its memories are affected, and it must be able to understand your language " +
                "for the modified memories to take root. Its mind fills in any gaps in the details of your " +
                "description. If the spell ends before you have finished describing the modified memories, the " +
                "creature's memory isn’t altered. Otherwise, the modified memories take hold when the spell ends.A " +
                "modified memory doesn’t necessarily affect how a creature behaves, particularly if the memory " +
                "contradicts the creature's natural inclinations, alignment, or beliefs. An illogical modified " +
                "memory, such as implanting a memory of how much the creature enjoyed dousing itself in acid, is " +
                "dismissed, perhaps as a bad dream. The DM might deem a modified memory too nonsensical to affect a " +
                "creature in a significant manner.A *[remove curse](../remove-curse/ 'remove curse (lvl 3)')* or " +
                "*[greater restoration](../greater-restoration/ 'greater restoration (lvl 5)')* spell cast on the " +
                "target restores the creature's true memory.";
        higherLevels = "If you cast this spell using a spell slot of 6th level or higher, you can alter the target’s " +
                "memories of an event that took place up to 7 days ago (6th level), 30 days ago (7th level), 1 year " +
                "ago (8th level), or any time in the creature’s past (9th level).";
    }

}
