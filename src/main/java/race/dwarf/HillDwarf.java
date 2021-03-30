package race.dwarf;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;

public class HillDwarf extends Dwarf {
	
	private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();

	public HillDwarf() {
		name = "Hill Dwarf";
		aih.incrementSpecificAbility(abilityBonus, Abilities.WISDOM, 1);
	}

}
