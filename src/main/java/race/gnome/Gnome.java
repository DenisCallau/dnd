package race.gnome;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;
import race.Race;

public class Gnome extends Race {
	
	private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public Gnome() {
		name = "Gnome";
		size = "Small";
		speed = 25;
		languages.add(constants.Languages.COMMON.toString());
		languages.add(constants.Languages.GNOMISH.toString());
		aih.incrementSpecificAbility(abilityBonus, Abilities.INTELLIGENCE, 2);
	}

}
