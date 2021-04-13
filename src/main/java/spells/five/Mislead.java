package spells.five;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Mislead extends Spell {

    public Mislead() {
        name = "Mislead";
        level = 5;
        school = Schools.ILLUSION;
        components = new Components[]{
                Components.SOMATIC,
        };
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "You become invisible at the same time that an illusory double of you appears where you are standing. The double lasts for the duration, but the invisibility ends if you attack or cast a spell.You can use your action to move your illusory double up to twice your speed and make it gesture, speak, and behave in whatever way you choose.You can see through its eyes and hear through its ears as if you were located where it is. On each of your turns as a bonus action, you can switch from using its senses to using your own, or back again. While you are using its senses, you are blinded and deafened in regard to your own surrounding.";
    }

}
