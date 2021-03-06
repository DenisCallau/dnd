package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class LocateAnimalsorPlants extends Spell {

    public LocateAnimalsorPlants() {
        name = "Locate Animals or Plants";
        level = 2;
        school = Schools.DIVINATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a bit of fur from a bloodhound";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(constants.Target.SELF);
        ritual = true;
        description = "Describe or name a specific kind of beast or plant. Concentrating on the voice of nature in " +
                "your surroundings, you learn the direction and distance to the closest creature or plant of that " +
                "kind within 5 miles, if any are present.";
    }

}
