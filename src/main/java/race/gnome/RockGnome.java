package race.gnome;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;

public class RockGnome extends Gnome {
	
private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public RockGnome() {
		name = "Rock Gnome";
		aih.incrementSpecificAbility(abilityBonus, Abilities.CONSTITUITION, 1);
	}

}
