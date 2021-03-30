package spells.cantrips;

import character.Character;
import spells.CastableSpell;
import spells.MaterialSpell;
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

public class BoomingBlade extends Spell implements CastableSpell, MaterialSpell {
	
	public BoomingBlade(Character caster) {
		name = "Booming Blade";
		level = 0;
		school = SpellSchools.EVOCATION;
		castingTime = new SpellCastingTime(1, SpellCastingTimeTypes.ACTION);
		range = new SpellRange(5, SpellRangeTypes.SELF);
		components.add(SpellComponents.SOMATIC);
		components.add(SpellComponents.MATERIAL);
		duration = new SpellDuration(1, SpellDurationTypes.ROUND);
		concentration = false;
		target = new SpellTarget(SpellTargetTypes.CREATURE);
		this.caster = caster;
		int userLevel = caster.getLevel();

		description = "You brandish the weapon used in the spell's casting and make a melee attack with it against one creature within 5 feet of you. On a hit, the target suffers the weapon attack's normal effects and then becomes sheathed in booming energy until the start of your next turn. If the target willingly moves 5 feet or more before then, the target takes 1d8 thunder damage, and the spell ends.";
		atHigherLevelsDescription = "At 5th level, the melee attack deals an extra 1d8 thunder damage to the target on a hit, and the damage the target takes for moving increases to 2d8. Both damage rolls increase by 1d8 at 11th level (2d8 and 3d8) and again at 17th level (3d8 and 4d8).";
	}

	@Override
	public boolean castSpell() {
		return false;
	}

	@Override
	public boolean useMaterial() {
		return false;
	}

}
