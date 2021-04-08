package race.halforc;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;
import race.Race;

public class HalfOrc extends Race {
	
	private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public HalfOrc() {
		name = "Half-Orc";
		size = "Medium";
		speed = 30;
		languages.add(constants.Languages.COMMON.toString());
		languages.add(constants.Languages.ORC.toString());
		aih.incrementSpecificAbility(abilityBonus, Abilities.STRENGTH, 2);
		aih.incrementSpecificAbility(abilityBonus, Abilities.CONSTITUITION, 1);
	}

}
