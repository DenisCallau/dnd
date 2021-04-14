package spells.seven;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FingerofDeath extends Spell {

    public FingerofDeath() {
        name = "Finger of Death";
        level = 7;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        ritual = false;
        description = "You send negative engery coursing through a creature that you can see within range, causing it" +
                " searing pain. The target must make a Constitution saving throw. It takes 7d8 + 30 necrotic damage " +
                "on a failed save, or half as much damage on a successful one.A humanoid killed by this spell rises " +
                "at the start of your next turn as a zombie that is permanently under your command, following your " +
                "verbal orders to the best of its ability.";
    }

}
