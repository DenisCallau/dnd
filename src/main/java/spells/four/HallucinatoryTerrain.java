package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class HallucinatoryTerrain extends Spell {

    public HallucinatoryTerrain() {
        name = "Hallucinatory Terrain";
        level = 4;
        school = Schools.ILLUSION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a stone, a twig, and a bit of green plant";
        castingTime = new CastingTime(10, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(300);
        ritual = false;
        description = "You make natural terrain in a 150-foot cube in range look, sound, and smell like some other " +
                "sort of natural terrain. Thus, open fields or a road can be made to resemble a swamp, hill, " +
                "crevasse, or some other difficult or impassable terrain. A pond can be made to seem like a grassy " +
                "meadow, a precipice like a gentle slope, or a rock-strewn gully like a wide and smooth road. " +
                "Manufactured structures, equipment, and creatures within the area aren’t changed in appearance.The " +
                "tactile characteristics of the terrain are unchanged, so creatures entering the area are likely to " +
                "see through the illusion. If the difference isn’t obvious by touch, a creature carefully examining " +
                "the illusion can attempt an Intelligence (Investigation) check against your spell save DC to " +
                "disbelieve it. A creature who discerns the illusion for what it is, sees it as a vague image " +
                "superimposed on the terrain.";
    }

}
