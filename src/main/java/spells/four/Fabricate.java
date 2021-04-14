package spells.four;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Fabricate extends Spell {

    public Fabricate() {
        name = "Fabricate";
        level = 4;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(10, TimeUnits.MINUTE);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(120);
        ritual = false;
        description = "You convert raw materials into products of the same material. For example, you can fabricate a" +
                " wooden bridge from a clump of trees, a rope from a patch of hemp, and clothes from flax or wool" +
                ".Choose raw materials that you can see within range. You can fabricate a Large or smaller object " +
                "(contained within a 10-foot cube, or eight connected 5-foot cubes), given a sufficient quantity of " +
                "raw material. If you are working with metal, stone, or another mineral substance, however, the " +
                "fabricated object can be no larger than Medium (contained within a single 5-foot cube). The quality " +
                "of objects made by the spell is commensurate with the quality of the raw materials.Creatures or " +
                "magic items can't be created or transmuted by this spell. You also can't use it to create items that" +
                " ordinarily require a high degree of craftsmanship, such as jewelry, weapons, glass, or armor, " +
                "unless you have proficiency with the type of artisan's tools used to craft such objects.";
    }

}
