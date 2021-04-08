package items.usable;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class AlchemistFire extends UsableItem {

	public AlchemistFire() {
		name = "Alchemist's Fire (flask)";
		price = new Price(50, CurrencyUnits.GOLD);
		weight = new Weight(1, WeightUnits.POUND);
		description = "This sticky, adhesive fluid ignites when exposed to air. As an action, you can throw this flask up to 20 feet, shattering it on impact. Make a ranged Attack against a creature or object, treating the alchemist's fire as an Improvised Weapon. On a hit, the target takes 1d4 fire damage at the start of each of its turns. A creature can end this damage by using its action to make a DC 10 Dexterity check to extinguish the flames.";
	}

}
