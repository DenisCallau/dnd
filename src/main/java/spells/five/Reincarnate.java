package spells.five;

import constants.TimeUnits;
import constants.Target;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class Reincarnate extends Spell {

    public Reincarnate() {
        name = "Reincarnate";
        level = 5;
        school = Schools.TRANSMUTATION;
        components = new Components[]{
                Components.VERBAL,
                Components.SOMATIC,
                Components.MATERIAL
        };
        String material = "rare oils and unguents worth at least 1,000 gp, which the spell consumes";
        castingTime = new CastingTime(1, TimeUnits.HOUR);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(0);
        target = new Target(Aberbo);
        ritual = false;
        description = "You touch a dead humanoid or a piece of a dead humanoid. Provided that the creature has been dead no longer than 10 days, the spell forms a new adult body for it and then calls the soul to enter that body. If the target's soul isn't free or willing to do so, the spell fails.The magic fashions a new body for the creature to inhabit, which likely causes the creature's race to change. The DM rolls a d100 and consults the following table to determine what form the creature takes when restored to life, or the DM chooses a form.|d100|Race||--------|---------||01-04|Dragonborn||05-13|Dwarf, hill||14-21|Dwarf, mountain||22-25|Elf, dark||26-34|Elf, high||35-42|Elf, wood||43-46|Gnome, forest||47-52|Gnome, rock||53-56|Half-elf||57-60|Half-orc||61-68|Halfling, lightfoot||69-76|Halfling, stout||77-96|Human||97-00|Tiefling|The reincarnated creature recalls its former life and experiences. It retains the capabilities it had in its original form, except it exchanges its original race for the new one and changes its racial traits accordingly.";
    }

}
