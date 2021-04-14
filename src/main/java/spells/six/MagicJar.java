package spells.six;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class MagicJar extends Spell {

    public MagicJar() {
        name = "Magic Jar";
        level = 6;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "a gem, crystal, reliquary, or some other ornamental container worth at least 500 gp";
        castingTime = new CastingTime(1, TimeUnits.MINUTE);
//TODO: CHECK DURATION
        range = new Range(constants.Target.SELF);
        ritual = false;
        description = "Your body falls into a catatonic state as your soul leaves it and enters the container you " +
                "used for the spell's material component. While your soul inhabits the container, you are aware of " +
                "your surroundings as if you were in the container's space. You can't move or use reactions. The only" +
                " action you can take is to project your soul up to 100 feet out of the container, either returning " +
                "to your living body (and ending the spell) or attempting to possess a humanoid's body.You can " +
                "attempt to possess any humanoid within 100 feet of you that you can see (creatures warded by a " +
                "*[protection from evil and good](../protection-from-evil-and-good 'protection from evil and good " +
                "(lvl 1)')* or *[magic circle](../magic-circle 'magic circle (lvl 3)')* spell can't be possessed). " +
                "The target must make a Charisma saving throw. On a failure, your soul moves into the target's body, " +
                "and the target's soul becomes trapped in the container. On a success, the target resists your " +
                "efforts to possess it, and you can't attempt to possess it again for 24 hours.Once you possess a " +
                "creature's body, you control it. Your game statistics are replaced by the statistics of the " +
                "creature, though you retain your alignment and your Intelligence, Wisdom, and Charisma scores. You " +
                "retain the benefit of your own class features. If the target has any class levels, you can't use any" +
                " of its class features.Meanwhile, the possessed creature's soul can perceive from the container " +
                "using its own senses, but it can't move or take actions at all.While possessing a body, you can use " +
                "your action to return from the host body to the container if it is within 100 feet of you, returning" +
                " the host creature's soul to its body. If the host body dies while you're in it, the creature dies, " +
                "and you must make a Charisma saving throw against your own spellcasting DC. On a success, you return" +
                " to the container if it is within 100 feet of you. Otherwise, you die.If the container is destroyed " +
                "or the spell ends, your soul immediately returns to your body. If your body is more than 100 feet " +
                "away from you or if your body is dead when you attempt to return to it, you die. If another " +
                "creature's soul is in the container when it is destroyed, the creature's soul returns to its body if" +
                " the body is alive and within 100 feet. Otherwise, that creature dies.When the spell ends, the " +
                "container is destroyed.";
    }

}
