package race.halfelf;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;
import race.Race;

public class HalfElf extends Race {
	
	private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public HalfElf() {
		name = "Half-Elf";
		size = "Medium";
		speed = 30;
		languages.add(constants.Languages.COMMON.toString());
		languages.add(constants.Languages.ELVISH.toString());
		aih.incrementSpecificAbility(abilityBonus, Abilities.CHARISMA, 2);
		//TODO: +1 to two other ability scores
		//TODO: +1 language of your choice
	}

}
