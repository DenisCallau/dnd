package spells;

public class SpellDuration {
	
	private int duration;
	private SpellDurationTypes durationType;
	
	public SpellDuration(int duration, SpellDurationTypes durationType) {
		this.duration = duration;
		this.durationType = durationType;
	}
	
	public SpellDuration(SpellDurationTypes durationType) {
		this.durationType = durationType; 
	}

	public int getDuration() {
		return duration;
	}

	public SpellDurationTypes getDurationType() {
		return durationType;
	}

}
