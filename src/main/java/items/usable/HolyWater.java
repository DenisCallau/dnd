package items.usable;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class HolyWater extends UsableItem {

	public HolyWater() {
		name = "Holy Water (flask)";
		price = new Price(25, CurrencyUnits.GOLD);
		weight = new Weight(1, WeightUnits.POUND);
		description = "As an action, you can splash the contents of this flask onto a creature within 5 feet of you or throw it up to 20 feet, shattering it on impact. In either case, make a ranged Attack against a target creature, treating the holy water as an Improvised Weapon. If the target is a fiend or Undead, it takes 2d6 radiant damage. A Cleric or Paladin may create holy water by performing a Special ritual. The ritual takes 1 hour to perform, uses 25 gp worth of powdered silver, and requires the caster to expend a 1st-level spell slot.";
	}

}
