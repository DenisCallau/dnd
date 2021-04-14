package spells.seven;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Simulacrum extends Spell {

    public Simulacrum() {
        name = "Simulacrum";
        level = 7;
        school = Schools.ILLUSION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "snow or ice in quantities sufficient to made a life-size copy of the duplicated creature; some " +
                "hair, fingernail clippings, or other piece of that creature's body placed inside the snow or ice; " +
                "and powdered ruby worth 1,500 gp, sprinkled over the duplicate and consumed by the spell";
        castingTime = new CastingTime(12, TimeUnits.HOUR);
//TODO: CHECK DURATION
        range = new Range(0);
        ritual = false;
        description = "You shape an illusory duplicate of one beast or humanoid that is within range for the entire " +
                "casting time of the spell. The duplicate is a creature, partially real and formed from ice or snow, " +
                "and it can take actions and otherwise be affected as a normal creature. It appears to be the same as" +
                " the original, but it has half the creature's hit point maximum and is formed without any equipment." +
                " Otherwise, the illusion uses all the statistics of the creature it duplicates.The simulacrum is " +
                "friendly to you and creatures you designate. It obeys your spoken commands, moving and acting in " +
                "accordance with your wishes and acting on your turn in combat. The simulacrum lacks the ability to " +
                "learn or become more powerful, so it never increases its level or other abilities, nor can it regain" +
                " expended spell slots.If the simulacrum is damaged, you can repair it in an alchemical laboratory, " +
                "using rare herbs and minerals worth 100gp per hit point it regains. The simulacrum lasts until it " +
                "drops to 0 hit points, at which point it reverts to snow and melts instantly.If you cast this spell " +
                "again, any currently active duplicates you created with this spell are instantly destroyed.";
    }

}
