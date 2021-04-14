package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Telekinesis extends Spell {

    public Telekinesis() {
        name = "Telekinesis";
        level = 5;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 10, TimeUnits.MINUTE);
        range = new Range(60);
        ritual = false;
        description = "You gain the ability to move or manipulate creatures or objects by thought. When you cast the " +
                "spell, and as your action each round for the duration, you can exert your will on one creature or " +
                "object that you can see within range, causing the appropriate effect below. You can affect the same " +
                "target round after round, or choose a new one at any time. If you switch targets, the prior target " +
                "is no longer affected by the spell.On subsequent rounds, you can use your action to attempt to " +
                "maintain your telekinetic grip on the creature by repeating the contest.If the object is worn or " +
                "carried by a creature, you must make an ability check with your spellcasting ability contested by " +
                "that creature’s Strength check. If you succeed, you pull the object away from that creature and can " +
                "move it up to 30 feet in any direction but not beyond the range of this spell.You can exert fine " +
                "control on objects with your telekinetic grip, such as manipulating a simple tool, opening a door or" +
                " a container, stowing or retrieving an item from an open container, or pouring the contents from a " +
                "vial.";
    }

}
