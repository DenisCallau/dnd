package spells.two;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class PasswithoutTrace extends Spell {

    public PasswithoutTrace() {
        name = "Pass without Trace";
        level = 2;
        school = Schools.ABJURATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "ashes from a burned leaf of mistletoe and a sprig of spruce";
        castingTime = new CastingTime(1, TimeUnits.ACTION);
        duration = new Duration(true, 1, TimeUnits.HOUR);
        range = new Range(Target.SELF);
        target = new Target(Aberbo);
        ritual = false;
        description = "A veil of shadows and silence radiates from you, masking you and your companions from detection. For the duration, each creature you choose within 30 feet of you (including you) has a +10 bonus to Dexterity (Stealth) checks and can�t be tracked except by magical means. A creature that receives this bonus leaves behind no tracks or other traces of its passage.";
    }

}
