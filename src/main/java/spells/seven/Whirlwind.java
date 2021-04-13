package spells.seven;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Whirlwind extends Spell {

    public Whirlwind() {
        name = "Whirlwind";
        level = 7;
        school = Schools.EVOCATION;
        components = new Components[]{
                Components.VERBAL,
                Components.MATERIAL
        };
        String material = "a piece of straw";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.MINUTE);
        range = new Range(300);
        target = new Target(Aberbo);
        ritual = false;
        description = "A whirlwind howls down to a point on the ground you specify. The whirlwind is a 10-foot-radius, 30-foot-high cylinder centered on that point. Until the spell ends, you can use your action to move the whirlwind up to 30 feet in any direction along the ground. The whirlwind sucks up any Medium or smaller objects that aren�t secured to anything and that aren�t worn or carried by anyone.A creature must make a Dexterity saving throw the first time on a turn that it enters the whirlwind or that the whirlwind enters its space, including when the whirlwind first appears. A creature takes 10d6 bludgeoning damage on a failed save, or half as much damage on a successful one. In addition, a Large or smaller creature that fails the save must succeed on a Strength saving throw or become restrained in the whirlwind until the spell ends. When a creature starts its turn restrained by the whirlwind, the creature is pulled 5 feet higher inside it, unless the creature is at the top. A restrained creature moves with the whirlwind and falls when the spell ends, unless the creature has some means to stay aloft.A restrained creature can use an action to make a Strength or Dexterity check against your spell save DC. If successful, the creature is no longer restrained by the whirlwind and is hurled 3d6 � 10 feet away from it in a random direction.";
    }

}
