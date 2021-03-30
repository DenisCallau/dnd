package race.elf;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;

public class WoodElf extends Elf {
	
private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public WoodElf() {
		name = "Wood Elf";
		speed = 35;
		aih.incrementSpecificAbility(abilityBonus, Abilities.WISDOM, 1);
	}

}
