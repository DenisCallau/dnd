package spells;

public class SpellCastingTime {
	
	private int castingTime;
	private SpellCastingTimeTypes castingTimeType;
	
	public SpellCastingTime(int castingTime, SpellCastingTimeTypes castingTimeType) {
		this.castingTime = castingTime;
		this.castingTimeType = castingTimeType;
	}

	public int getCastingTime() {
		return castingTime;
	}

	public SpellCastingTimeTypes getCastingTimeType() {
		return castingTimeType;
	}

}
