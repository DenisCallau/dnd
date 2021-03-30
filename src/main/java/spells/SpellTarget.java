package spells;

public class SpellTarget {
	
	private SpellTargetTypes targetType;
	private int qtyOfTargets;
	
	public SpellTarget(SpellTargetTypes targetType, int qtyOfTargets) {
		this.targetType = targetType;
		this.qtyOfTargets = qtyOfTargets;
	}
	
	public SpellTarget(SpellTargetTypes targetType) {
		this.targetType = targetType;
	}

	public SpellTargetTypes getTargetType() {
		return targetType;
	}

	public int getQtyOfTargets() {
		return qtyOfTargets;
	}

}
