package spells.cantrip;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class CreateBonfire extends Spell {

    public CreateBonfire() {
        name = "Create Bonfire";
        level = 0;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(60);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create a bonfire on ground that you can see within range. Until the spell ends, the " +
                "bonfire fills a 5-foot cube. Any creature in the bonfire’s space when you cast the spell must " +
                "succeed on a Dexterity saving throw or take 1d8 fire damage. A creature must also make the saving " +
                "throw when it enters the bonfire’s space for the first time on a turn or ends its turn there.The " +
                "spell’s damage increases by 1d8 when you reach 5th level (2d8), 11th level (3d8), and 17th level " +
                "(4d8).";
    }

}
