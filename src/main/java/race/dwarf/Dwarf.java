package race.dwarf;

import constants.Abilities;
import constants.Languages;
import helpers.AbilityIncrementalHelper;
import race.Race;

public abstract class Dwarf extends Race {
	
	private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public Dwarf() {
		name = "Dwarf";
		size = "Medium";
		speed = 25;
		languages.add(Languages.COMMON);
		languages.add(Languages.DWARVISH);
		aih.incrementSpecificAbility(abilityBonus, Abilities.CONSTITUITION, 2);
	}
	
}
