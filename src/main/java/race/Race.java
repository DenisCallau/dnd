package race;

import java.util.ArrayList;
import java.util.HashMap;
import constants.Abilities;

public abstract class Race {
	
	protected String name;
	protected String size;
	protected int speed;
	protected ArrayList<String> languages = new ArrayList<String>();
	protected HashMap<Abilities, Integer> abilityBonus = new HashMap<Abilities, Integer>();
	
	public HashMap<Abilities, Integer> getAbilityBonus() {
		return this.abilityBonus;
	}

}
