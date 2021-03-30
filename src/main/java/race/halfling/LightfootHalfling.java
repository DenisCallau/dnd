package race.halfling;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;

public class LightfootHalfling extends Halfling {
	
private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public LightfootHalfling() {
		name = "Lightfoot Halfling";
		aih.incrementSpecificAbility(abilityBonus, Abilities.CHARISMA, 1);
	}

}
