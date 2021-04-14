package spells.eight;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Clone extends Spell {

    public Clone() {
        name = "Clone";
        level = 8;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a diamond worth at least 1,000 gp and at least 1 cubic inch of flesh of the creature that is to " +
                "be cloned, which the spell consumes, and a vessel worth at least 2,000 gp that has a sealable lid " +
                "and is large enough to hold a medium creature, such as a large urn, coffin, mud-filled cyst in the " +
                "ground, or crystal container filled with salt water";
        castingTime = new CastingTime(1, TimeUnits.HOUR);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(0);
        ritual = false;
        description = "This spell grows an inert duplicate of a living creature as a safeguard against death. This " +
                "clone forms inside a sealed vessel and grows to full size and maturity after 120 days; you can also " +
                "choose to have the clone be a younger version of th esame creature. It remains inert and endures " +
                "indefinitely, as long as its vessel remains undisturbed.At any time after the clone matures, if the " +
                "original creature dies, its soul tranfers to the clone, provided that the soul is free and willing " +
                "to return. The clone is physically identical to the original and has the same personality, memories," +
                " and abilities, but none of the original's equipment. The original creature's physical remains, if " +
                "they still exist, become inert and can't thereafter be restured to life, since the creature's soul " +
                "is elsewhere.";
    }

}
