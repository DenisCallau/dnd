package race.elf;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;

public class DarkElf extends Elf {

private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public DarkElf() {
		name = "Dark Elf (Drow)";
		aih.incrementSpecificAbility(abilityBonus, Abilities.CHARISMA, 1);
	}
	
}
