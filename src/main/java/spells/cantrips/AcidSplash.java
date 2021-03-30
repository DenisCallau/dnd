package spells.cantrips;

import character.Character;
import dices.D6;
import spells.Spell;
import spells.SpellCastingTime;
import spells.SpellCastingTimeTypes;
import spells.SpellComponents;
import spells.SpellDuration;
import spells.SpellDurationTypes;
import spells.SpellRange;
import spells.SpellRangeTypes;
import spells.SpellSchools;
import spells.SpellTarget;
import spells.SpellTargetTypes;

public class AcidSplash extends Spell {
	
	public AcidSplash(Character caster) {
		name = "Acid Splash";
		level = 0;
		school = SpellSchools.CONJURATION;
		castingTime = new SpellCastingTime(1, SpellCastingTimeTypes.ACTION);
		range = new SpellRange(60, SpellRangeTypes.FEET);
		components.add(SpellComponents.VERBAL);
		components.add(SpellComponents.SOMATIC);
		duration = new SpellDuration(SpellDurationTypes.INSTANTANEOUS);
		concentration = false;
		target = new SpellTarget(SpellTargetTypes.CREATURE, 1);
		valueDice = new D6();
		int userLevel = caster.getLevel();
		if(userLevel < 5) {
			numberOfDices = 1;
		}
		if(userLevel >= 5 && userLevel < 11) {
			numberOfDices = 2;
		}
		if(userLevel >= 11 && userLevel < 17) {
			numberOfDices = 3;			
		}
		if(userLevel >= 17) {
			numberOfDices = 4;
		}
		description = "You hurl a bubble of acid. Choose one creature within range, or choose two creatures within range that are within 5 feet of each other. A target must succeed on a Dexterity saving throw or take 1d6 acid damage.";
		//TODO: Implement the choose of two creatures.
		atHigherLevelsDescription = "At Higher Levels. This spell's damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).";
	}

}
