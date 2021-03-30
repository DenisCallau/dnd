package skills;

import constants.Abilities;

public enum Skills {

	ATHLETICS("Athletics", Abilities.STRENGTH),
	ACROBATICS("Acrobatics", Abilities.DEXTERY),
	SLEIGHT_OF_HAND("Sleight of Hand", Abilities.DEXTERY),
	STEALTH("Stealth", Abilities.DEXTERY),
	ARCANA("Arcana", Abilities.INTELLIGENCE),
	HISTORY("History", Abilities.INTELLIGENCE),
	INVESTIGATION("Investigation", Abilities.INTELLIGENCE),
	NATURE("Nature", Abilities.INTELLIGENCE),
	RELIGION("Religion", Abilities.INTELLIGENCE),
	ANIMAL_HANDLING("Animal Handling", Abilities.WISDOM),
	INSIGHT("Insight", Abilities.WISDOM),
	MEDICINE("Medicine", Abilities.WISDOM),
	PERCEPTION("Perception", Abilities.WISDOM),
	SURVIVAL("Survival", Abilities.WISDOM),
	DECEPTION("Deception", Abilities.CHARISMA),
	INTIMIDATION("Intimidation", Abilities.CHARISMA),
	PERFORMANCE("Performance", Abilities.CHARISMA),
	PERSUASION("Persuasion", Abilities.CHARISMA);

	Skills(String string, Abilities ability) {
	}
	

}
