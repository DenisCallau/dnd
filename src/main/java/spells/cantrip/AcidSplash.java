package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class AcidSplash extends Spell {

    public AcidSplash() {
        name = "Acid Splash";
        level = 0;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "You hurl a bubble of acid. Choose one creature within range, or choose two creatures within " +
                "range that are within 5 feet of each other. A target must succeed on a Dexterity saving throw or " +
                "take 1d6 acid damage.This spell's damage increases by 1d6 when you reach 5th level (2d6), 11th level" +
                " (3d6), and 17th level (4d6).";
    }

}
