package spells.eight;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ControlWeather extends Spell {

    public ControlWeather() {
        name = "Control Weather";
        level = 8;
        school = Schools.TRANSMUTATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "burning incense and bits of earth and wood mixed in water";
        castingTime = new CastingTime(10, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "You take control of the weather within 5 miles of you for the duration. You must be outdoors to cast this spell. Moving to a place where you don't have a clear path to the sky ends the spell early.When you cast the spell, you change the current weather conditions, which are determined by the DM based on the climate and season. You can change precipitation, temperature, and wind. It takes 1d4 x 10 minutes for the new conditions to take effect. Once they do so, you can change the conditions again. When the spell ends, the weather gradually returns to normal.When you change the weather conditions, find a current condition on the following tables and change its stage by one, up or down. When changing the wind, you can change its direction.## Precipitation|Stage|Condition||---|---|| 1 | Clear || 2 | Light clouds || 3 | Overcast or ground fog || 4 | Rain, hail, or snow || 5 | Torrential rain, driving hail, or blizzard |## Temperature|Stage|Condition||---|---|| 1 | Unbearable heat || 2 | Hot || 3 | Warm || 4 | Cool || 5 | Cold || 6 | Arctic cold |## Wind|Stage|Condition||---|---|| 1 | Calm || 2 | Moderate wind || 3 | Strong wind || 4 | Gale || 5 | Storm |";
    }

}
