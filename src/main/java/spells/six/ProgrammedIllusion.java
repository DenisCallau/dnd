package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class ProgrammedIllusion extends Spell {

    public ProgrammedIllusion() {
        name = "Programmed Illusion";
        level = 6;
        school = Schools.ILLUSION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a bit of fleece and jade dust worth at least 25 gp";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
//TODO: CHECK DURATION
        range = new Range(120);
        target = new Target(Aberbo);
        ritual = false;
        description = "You create an illusion of an object, a creature, or some other visible phenomenon within range" +
                " that activates when a specific condition occurs. The illusion is imperceptible until then. It must " +
                "be no larger than a 30-foot cube, and you decide when you cast the spell how the illusion behaves " +
                "and what sounds it makes. This scripted performance can last up to 5 minutes.When the condition you " +
                "specify occurs, the illusion springs into existence and performs in the manner you described. Once " +
                "the illusion finishes performing, it disappears and remains dormant for 10 minutes. After this time," +
                " the illusion can be activated again. The triggering condition can be as general or as detailed as " +
                "you like, though it must be based on visual or audible conditions that occur within 30 feet of the " +
                "area. For example, you could create an illusion of yourself to appear and warn off others who " +
                "attempt to open a trapped door, or you could set the illusion to trigger only when a creature says " +
                "the correct word or phrase.Physical interaction with the image reveals it to be an illusion, because" +
                " things can pass through it. A creature that uses its action to examine the image can determine that" +
                " it is an illusion with a successful Intelligence (Investigation) check against your spell save DC. " +
                "If a creature discerns the illusion for what it is, the creature can see through the image, and any " +
                "noise it makes sounds hollow to the creature.";
    }

}
