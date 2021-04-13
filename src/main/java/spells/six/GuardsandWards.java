package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class GuardsandWards extends Spell {

    public GuardsandWards() {
        name = "Guards and Wards";
        level = 6;
        school = Schools.ABJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "burning incense, a small measure of brimstone and oil, a knotled string, a small amount of umber " +
                "hulk blood, and a small silver rod worth at least 10 gp";
        castingTime = new CastingTime(10, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create a ward that protects up to 2,500 square feet of floor space (an area 50 feet " +
                "square, or one hundred 5-foot squares or twenty-five 10-foot squares). The warded area can be up to " +
                "20 feet tall, and shaped as you desire. You can ward several stories of a stronghold by dividing the" +
                " area among them, as long as you can walk into each contiguous area while you are casting the spell" +
                ".When you cast this spell, you can specify individuals that are unaffected by any or all of the " +
                "effects that you choose. You can also specify a password that, when spoken aloud, makes the speaker " +
                "immune to these effects.*Guards and wards* creates the following effects within the warded area.* " +
                "Place *[dancing lights](../dancing-lights/ 'dancing lights (cantrip)')* in four corridors. You can " +
                "designate a simple program that the lights repeat as long as guards and wards lasts.* Place *[magic " +
                "mouth](../magic-mouth/ 'magic mouth (lvl 2)')* in two locations.* Place *[stinking cloud](." +
                "./stinking-cloud/ 'stinking cloud (lvl 3)')* in two locations. The vapors appear in the places you " +
                "designate; They return within 10 minutes if dispersed by wind while *guards and wards* lasts.* Place" +
                " a constant *[gust of wind](../gust-of-wind/ 'gust of wind (lvl 2)')* in one corridor or room.* " +
                "Place a *[suggestion](../suggestion/ 'suggestion (lvl 2)')* in one location. You select an area of " +
                "up to 5 feet square, and any creature that enters or passes through the area recieves the suggestion" +
                " mentally.The whole warded area radiates magic. A *[dispel magic](../dispel-magic/ 'dispel magic " +
                "(lvl 3)')* cast on a specific effect, if successful, removes only that effect.You can create a " +
                "permanently guarded and warded structure by casting this spell there every day for one year.";
    }

}
