package race.human;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;
import race.Race;

public class Human extends Race {
	
	private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public Human() {
		name = "Human";
		size = "Medium";
		speed = 30;
		languages.add(constants.Languages.COMMON);
		//TODO: Human should choose one more language
		aih.incrementSpecificAbility(abilityBonus, Abilities.STRENGTH, 1);
		aih.incrementSpecificAbility(abilityBonus, Abilities.DEXTERY, 1);
		aih.incrementSpecificAbility(abilityBonus, Abilities.CONSTITUITION, 1);
		aih.incrementSpecificAbility(abilityBonus, Abilities.INTELLIGENCE, 1);
		aih.incrementSpecificAbility(abilityBonus, Abilities.WISDOM, 1);
		aih.incrementSpecificAbility(abilityBonus, Abilities.CHARISMA, 1);
	}

}
