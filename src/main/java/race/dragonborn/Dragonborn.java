package race.dragonborn;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;
import race.Race;

public class Dragonborn extends Race {
	
	private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public Dragonborn() {
		name = "Dragonborn";
		size = "Medium";
		speed = 30;
		languages.add(constants.Languages.COMMON.toString());
		languages.add(constants.Languages.DRACONIC.toString());
		aih.incrementSpecificAbility(abilityBonus, Abilities.STRENGTH, 2);
		aih.incrementSpecificAbility(abilityBonus, Abilities.CHARISMA, 1);
	}

}
