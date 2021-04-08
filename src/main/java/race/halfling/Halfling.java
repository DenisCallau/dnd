package race.halfling;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;
import race.Race;

public class Halfling extends Race {
	
	private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public Halfling() {
		name = "Halfling";
		size = "Small";
		speed = 25;
		languages.add(constants.Languages.COMMON.toString());
		languages.add(constants.Languages.HALFLING.toString());
		aih.incrementSpecificAbility(abilityBonus, Abilities.DEXTERY, 2);
	}

}
