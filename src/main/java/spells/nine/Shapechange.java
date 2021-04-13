package spells.nine;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Shapechange extends Spell {

    public Shapechange() {
        name = "Shapechange";
        level = 9;
        school = Schools.TRANSMUTATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a jade circlet worth at least 1,500 gp, which you must place on your head before you cast the " +
                "spell";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(constants.Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "You assume the form of a different creature for the duration. The new form can be of any " +
                "creature with a challenge rating equal to your level or lower. The creature can't be a construct or " +
                "an undead, and you must have seen the sort of creature at least once. You transform into an average " +
                "example of that creature, one without any class levels or the Spellcasting trait.Your game " +
                "statistics are replaced by the statistics of the chosen creature, though you retain your alignement " +
                "and Intelligence, Wisdom and Charisma scores. You also retain all of your skill and saving throw " +
                "proficiencies, in addition to gaining those of the creature. If the creature has the same " +
                "proficiency as you and the bonus listed in its statistics is higher than yours, use the creature's " +
                "bonus in place of yours. You can't use any legendary actions or lair actions of the new form.You " +
                "assume the hit points and Hit Dice of the new form. When you revert to your normal form, you return " +
                "to the number of hit points you had before you transformed. If you revert as a result of dropping to" +
                " 0 hit points, any excess damage carries over to your normal form. As long as the excess damage " +
                "doesn't reduce your normal form to 0 hit points, you aren't knocked unconscious.You retain the " +
                "benefit of any features from your class, race, or other source and can use them, provided that your " +
                "new form is physically capable of doing so. You can't use any special senses you have (for example, " +
                "darkvision) unless your new form also has that sense. You can only speak if the creature can " +
                "normally speak.When you transform, you choose whether your equipment falls to the ground, merges " +
                "into the new form, or is worn by it. Worn equipment functions as normal. The DM determines whether " +
                "it is practical for the new form to wear a piece of equipment, based on the creature's shape and " +
                "size. Your equipment doesn't change shape or size to match the new form, and any equipment that the " +
                "new form can't wear must either fall to the ground or merge into your new form. Equipment that " +
                "merges has no effect in that state.";
    }

}
