package race.dwarf;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;

public class MountainDwarf extends Dwarf {

	private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public MountainDwarf() {
		name = "Mountain Dwarf";
		aih.incrementSpecificAbility(abilityBonus, Abilities.STRENGTH, 2);
	}
}
