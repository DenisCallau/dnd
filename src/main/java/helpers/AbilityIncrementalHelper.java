package helpers;

import java.util.HashMap;
import java.util.Map.Entry;

import constants.Abilities;

public class AbilityIncrementalHelper {

	public void incrementSpecificAbility(HashMap<Abilities, Integer> abilityBonuses, Abilities ability, int qty) {
		if(abilityBonuses.get(ability) != null) {			
			abilityBonuses.put(ability, abilityBonuses.get(ability) + qty);
		} else {
			abilityBonuses.put(ability, qty);
		}
	}
	
	
	/**
	 * Merge list2 into list1
	 * @param list1 List that will be incremented
	 * @param list2 List with values used in incrementing
	 */
	public HashMap<Abilities, Integer> combineAbilityList(HashMap<Abilities, Integer> list1, HashMap<Abilities, Integer> list2) {
		for (Entry<Abilities, Integer> l : list2.entrySet()) {
			incrementSpecificAbility(list1, l.getKey(), l.getValue());
		}
		
		return list1;
	}
	

}
