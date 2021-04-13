package spells.five;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Maelstrom extends Spell {

    public Maelstrom() {
        name = "Maelstrom";
        level = 5;
        school = Schools.EVOCATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "paper or leaf in the shape of a funnel";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(120);
        target = new Target(Aberbo);
        ritual = false;
        description = "A mass of 5-foot-deep water appears and swirls in a 30-foot radius centered on a point you can" +
                " see within range. The point must be on ground or in a body of water. Until the spell ends, that " +
                "area is difficult terrain, and any creature that starts its turn there must succeed on a Strength " +
                "saving throw or take 6d6 bludgeoning damage and be pulled 10 feet toward the center.";
    }

}
