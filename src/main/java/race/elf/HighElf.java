package race.elf;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;

public class HighElf extends Elf {
	
	private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public HighElf() {
		name = "High Elf";
		aih.incrementSpecificAbility(abilityBonus, Abilities.INTELLIGENCE, 1);
		// TODO: High Elf should choose one more language
	}

}
