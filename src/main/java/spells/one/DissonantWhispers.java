package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class DissonantWhispers extends Spell {

    public DissonantWhispers() {
        name = "Dissonant Whispers";
        level = 1;
        school = Schools.ENCHANTMENT;
        components.add(Components.VERBAL);
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(60);
        ritual = false;
        description = "You whisper a discordant melody that only one creature of your choice within range can hear, " +
                "wracking it with terrible pain. The target must make a Wisdom saving throw. On a failed save, it " +
                "takes 3d6 psychic damage and must immediately use its reaction, if available, to move as far as its " +
                "speed allows away from you. The creature doesn't move into obviously dangerous ground, such as a " +
                "fire or a pit. On a successful save, the target takes half as much damage and doesn't have to move " +
                "away. A deafened creature automatically succeeds on the save.";
        higherLevels = "When you cast this spell using a spell slot of 2nd level or higher, the damage increases by " +
                "1d6 for each slot level above 1st.";
    }

}
