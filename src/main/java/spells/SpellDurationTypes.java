package spells;

public enum SpellDurationTypes {
	
	DAY("Day(s)"),
	HOUR("Hour(s)"),
	MINUTE("Minute(s)"),
	INSTANTANEOUS("Instantaneous"),
	UNTILL_DISPELLED("Until dispelled"),
	ROUND("Round");
	
	SpellDurationTypes(String name) {
	}	

}
