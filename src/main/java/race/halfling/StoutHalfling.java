package race.halfling;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;

public class StoutHalfling extends Halfling {
	
private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public StoutHalfling() {
		name = "Stout Halfling";
		aih.incrementSpecificAbility(abilityBonus, Abilities.CONSTITUITION, 1);
	}

}
