package spells.eight;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Feeblemind extends Spell {

    public Feeblemind() {
        name = "Feeblemind";
        level = 8;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a handful fo clay, crystal, glass, or mineral spheres";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(150);
        target = new Target(Aberbo);
        ritual = false;
        description = "You blast the mind of a creature that you can see within range, attempting to shatter its " +
                "intellect and personality. The target takes 4d6 psychic damage and must amke an Intelligence saving " +
                "throw.On a failed save, the creature's Intelligence and Charisma scores become 1. The creature can't" +
                " cast spells, activate magic items, understand language, or communicate in any intelligible way. The" +
                " creature can, however, identify its friends, follow them, and even protect them.At the end of every" +
                " 30 days, the creature can repeat its saving throw against this spell. If it succeeds on its saving " +
                "throw, the spell ends.The spell can also be ended by _[greater restoration](../greater-restoration/ " +
                "'greater restoration (lvl 5)')_, _[heal](../heal/ 'heal (lvl 6)')_, or _[wish](../wish/ 'wish (lvl " +
                "9)')_.";
    }

}
