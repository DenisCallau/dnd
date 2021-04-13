package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MoveEarth extends Spell {

    public MoveEarth() {
        name = "Move Earth";
        level = 6;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "an iron blade and a small bag containing a mixture of soils--c1ay, loam, and sand";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(120);
        target = new Target(Aberbo);
        ritual = false;
        description = "Choose an area of terrain no larger than 40 feet on a side within range. You can reshape dirt," +
                " sand, or clay in the area in any manner you choose for the duration. You can raise or lower the " +
                "area's elevation, create or fill in a trench, erect or flatten a wall, or form a pillar. The extent " +
                "of any such changes can't exceed half the area's largest dimension. So, if you affect a 40-foot " +
                "square, you can create a pillar up to 20 feet high, raise or lower the square's elevation by up to " +
                "20 feet, dig a trench up to 20 feet deep, and so on. It takes 10 minutes for these changes to " +
                "complete.At the end of every 10 minutes you spend concentrating on the spell, you can choose a new " +
                "area of terrain to affect.Because the terrain’s transformation occurs slowly, creatures in the area " +
                "can't usually be trapped or injured by the ground's movement. This spell can't manipulate natural " +
                "stone or stone construction. Rocks and structures shift to accommodate the new terrain. If the way " +
                "you shape the terrain would make a structure unstable, it might collapse.Similarly, this spell " +
                "doesn't directly affect plant growth. The moved earth carries any plants along with it.";
    }

}
