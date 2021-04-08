package race.tiefling;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;
import race.Race;

public class Tiefling extends Race {
	
	private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public Tiefling() {
		name = "Tiefling";
		size = "Medium";
		speed = 30;
		languages.add(constants.Languages.COMMON.toString());
		languages.add(constants.Languages.INFERNAL.toString());
		aih.incrementSpecificAbility(abilityBonus, Abilities.INTELLIGENCE, 2);
		aih.incrementSpecificAbility(abilityBonus, Abilities.CHARISMA, 2);
	}

}
