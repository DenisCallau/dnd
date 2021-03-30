package spells;

public class SpellRange {
	
	private int range;
	private SpellRangeTypes rangeType;
	
	public SpellRange(int range, SpellRangeTypes rangeType) {
		this.range = range;
		this.rangeType = rangeType;
	}
	
	public SpellRange(SpellRangeTypes rangeType) {
		this.rangeType = rangeType;
	}

	public int getRange() {
		return range;
	}

	public SpellRangeTypes getRangeType() {
		return rangeType;
	}

}
