package race.gnome;

import constants.Abilities;
import helpers.AbilityIncrementalHelper;

public class ForestGnome extends Gnome {
	
private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	public ForestGnome() {
		name = "Forest Gnome";
		aih.incrementSpecificAbility(abilityBonus, Abilities.DEXTERY, 1);
	}

}
