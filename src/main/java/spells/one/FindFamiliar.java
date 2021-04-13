package spells.one;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FindFamiliar extends Spell {

    public FindFamiliar() {
        name = "Find Familiar";
        level = 1;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "10gp worth of charcoal, incense, and herbs that must be consumed by fire in a brass brazier";
        castingTime = new CastingTime(1, TimeUnits.HOUR);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(10);
        target = new Target(Aberbo);
        ritual = true;
        description = "Your familiar acts independently of you, but it always obeys your commands. In combat, it " +
                "rolls its own initiative and acts on its own turn. A familiar can't attack, but it can take other " +
                "actions as normal.When the familiar drops to 0 hit points, it disappears, leaving behind no physical" +
                " form. It reappears after you cast this spell again.While your familiar is within 100 feet of you, " +
                "you can communicate with it telepathically. Additionally, as an action, you can see through your " +
                "familiar's eyes and hear what it hears until the start of your next turn, gaining the benefits of " +
                "any special senses that the familiar has. During this time, you are deaf and blind with regard to " +
                "your own senses.As an action, you can temporarily dismiss your familiar. It disappears into a pocket" +
                " dimension where it awaits your summons. Alternatively, you can dismiss it forever. As an action " +
                "while it is temporarily dismissed, you can cause it to reappear in any unoccupied space within 30 " +
                "feet of you.You can't have more than one familiar at a time. If you cast this spell while you " +
                "already have a familiar, you instead cause it to adopt a new form. Choose one of the forms from the " +
                "above list. Your familiar transforms into the chosen creature.Finally, when you cast a spell with a " +
                "range of touch, your familiar can deliver the spell as if it had cast the spell. Your familiar must " +
                "be within 100 feet of you, and it must use its reaction to deliver the spell when you cast it. If " +
                "the spell requires an attack roll, you use your action modifier for the roll.";
    }

}
