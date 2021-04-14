package spells.seven;

import constants.DistanceUnits;
import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ProjectImage extends Spell {

    public ProjectImage() {
        name = "Project Image";
        level = 7;
        school = Schools.ILLUSION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a small replica of you made from materials worth at least 5 gp";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.DAY);
        range = new Range(500, DistanceUnits.MILE);
        ritual = false;
        description = "You create an illusory copy of yourself that lasts for the duration. The copy can appear at " +
                "any location within range that you have seen before, regardless of intervening obstacles. The " +
                "illusion looks and sounds like you but is intangible. If the illusion takes any damage, it " +
                "disappears, and the spell ends.You can use your action to move this illusion up to twice your speed," +
                " and make it gesture, speak, and behave in whatever way you choose. It mimics your mannerisms " +
                "perfectly.You can see through its eyes and hear through its ears as if you were in its space. On " +
                "your turn as a bonus action, you can switch from using its senses to using your own, or back again. " +
                "While you are using its senses, you are blinded and deafened in regard to your own surroundings" +
                ".Physical interaction with the image reveals it to be an illusion, because things can pass through " +
                "it. A creature that uses its action to examine the image can determine that it is an illusion with a" +
                " successful Intelligence (Investigation) check against your spell save DC. If a creature discerns " +
                "the illusion for what it is, the creature can see through the image, and any noise it makes sounds " +
                "hollow to the creature.";
    }

}
