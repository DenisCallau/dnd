package spells.three;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class SleetStorm extends Spell {

    public SleetStorm() {
        name = "Sleet Storm";
        level = 3;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a pinch of dust and a few drops of water";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(150);
        target = new Target(Aberbo);
        ritual = false;
        description = "Until the spell ends, freezing rain and sleet fall in a 20-foot-tall cylinder with a 40-foot " +
                "radius centered on a point you choose within range. The area is heavily obscured, and exposed flames" +
                " in the area are doused.The ground in the area is covered with slick ice, making it difficult " +
                "terrain. When a creature enters the spell’s area for the first time on a turn or starts its turn " +
                "there, it must make a Dexterity saving throw. On a failed save, it falls prone.If a creature is " +
                "concentrating in the spell’s area, the creature must make a successful Constitution saving throw " +
                "against your spell save DC or lose concentration.";
    }

}
