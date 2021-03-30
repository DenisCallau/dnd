package race.elf;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;
import race.Race;

public class Elf extends Race {
	
	private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public Elf() {
		name = "Elf";
		size = "Medium";
		speed = 30;
		languages.add(constants.Languages.COMMON);
		languages.add(constants.Languages.ELVISH);
		aih.incrementSpecificAbility(abilityBonus, Abilities.DEXTERY, 2);
	}

}
