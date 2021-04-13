package spells.nine;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Range;
import helpers.Target;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class AstralProjection extends Spell {

    public AstralProjection() {
        name = "Astral Projection";
        level = 9;
        school = Schools.NECROMANCY;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        components.add(Components.MATERIAL);
        material = "for each creature you affect with this spell you must provide one jacinth worth at least 1,000 gp" +
                " and one ornately carved bar of silver worth at least 100gp, all of which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.HOUR);
//TODO: Check duration
//TODO: CHECK DURATION
        range = new Range(10);
        target = new Target(Aberbo);
        ritual = false;
        description = "You and up to eight willing creatures within range project your astral bodies into the Astral " +
                "Plane (the spell fails and the casting is wasted if you are already on that plane). The material " +
                "body you leave behind is unconscious and in a state of suspended animation; it doesn't need food or " +
                "air and doesn't age.Your astral body resembles your mortal form in almost every way, replicating " +
                "your game statistics and possessions. The principal difference is the addition of a silvery cord " +
                "that extends from between your shoulder blades and trails behind you, fading to invisibility after 1" +
                " foot. This cord is your tether to your material body. As long as the tether remains intact, you can" +
                " find your way home. If the cord is cut--something that can happen only when an effect specifically " +
                "states that it does--your soul and body are separated, killing you instantly.Your astral form can " +
                "freely travel through the Astral Plane and can pass through portals there leading to any other plane" +
                ". If you enter a new plane or return to the plane you were on when casting this spell, your body and" +
                " possessions are transported along the silver cord, allowing you to re-enter your body as you enter " +
                "the new plane. Your astral form is a separate incarnation. Any damage or other effects that apply to" +
                " it have no effect on your physical body, nor do they persist when you return to it.The spell ends " +
                "for you and your companions when you use your action to dismiss it. When the spell ends, the " +
                "affected creature returns to its physical body, and it awakens.The spell might also end early for " +
                "you or one of your companions. A successful _dispel magic_ spell used against an astral or physical " +
                "body ends the spell for that creature. If a creature's original body or its astral form drops to 0 " +
                "hit points, the spell ends for that creature. If the spell ends and the silver cord is intact, the " +
                "cord pulls the creature's astral form back to its body, ending its state of suspended animation.If " +
                "you are returned to your body prematurely, your companions remain in their astral forms and must " +
                "find their own way back to their bodies, usually by dropping to 0 hit points.";
    }

}
