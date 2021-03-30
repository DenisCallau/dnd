package race.halforc;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;
import race.Race;

public class HalrfOrc extends Race {
	
	private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public HalrfOrc() {
		name = "Half-Orc";
		size = "Medium";
		speed = 30;
		languages.add(constants.Languages.COMMON);
		languages.add(constants.Languages.ORC);
		aih.incrementSpecificAbility(abilityBonus, Abilities.STRENGTH, 2);
		aih.incrementSpecificAbility(abilityBonus, Abilities.CONSTITUITION, 1);
	}

}
