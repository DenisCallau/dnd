package spells.cantrips;

import character.Character;
import spells.CastableSpell;
import spells.Spell;
import spells.SpellCastingTime;
import spells.SpellCastingTimeTypes;
import spells.SpellComponents;
import spells.SpellDuration;
import spells.SpellDurationTypes;
import spells.SpellRange;
import spells.SpellRangeTypes;
import spells.SpellSchools;
import spells.SpellTarget;
import spells.SpellTargetTypes;

public class BladeWard extends Spell implements CastableSpell {
	
	public BladeWard(Character caster) {
		name = "Blade Ward";
		level = 0;
		school = SpellSchools.ABJURATION;
		castingTime = new SpellCastingTime(1, SpellCastingTimeTypes.ACTION);
		range = new SpellRange(SpellRangeTypes.SELF);
		components.add(SpellComponents.VERBAL);
		components.add(SpellComponents.SOMATIC);
		duration = new SpellDuration(1, SpellDurationTypes.ROUND);
		concentration = false;
		target = new SpellTarget(SpellTargetTypes.CREATURE);
		this.caster = caster;		
		description = "You extend your hand and trace a sigil of warding in the air. Until the end of your next turn, you have resistance against bludgeoning, piercing, and slashing damage dealt by weapon attacks.";		
	}

	@Override
	public boolean castSpell() {		
		caster.setBludgeoningResistance(true);
		caster.setPiercingResistance(true);
		caster.setSlashingResistance(true);
		return true;
	}
	
	

}
